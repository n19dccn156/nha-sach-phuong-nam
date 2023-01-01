package KhanhVySang.demo.Service.ThongTinSanPham;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KhanhVySang.demo.Model.ThongTinSanPham.SanPhamModel;
import KhanhVySang.demo.Repositories.ThongTinSanPham.SanPhamRepository;

@Service
public class SanPhamService {
    
    @Autowired
    private SanPhamRepository sanPhamRepository;
    
    public List<SanPhamModel> findAll(){
        return sanPhamRepository.findAll();
    }

    public SanPhamModel findByMaSanPham(int maSanPham){
        Optional<SanPhamModel> oSP = sanPhamRepository.findByMaSanPham(maSanPham);
        if(oSP.isPresent()) return new SanPhamModel();
        return oSP.get();
    }

    public SanPhamModel findByTenSanPham(String tenSanPham){
        Optional<SanPhamModel> oSP = sanPhamRepository.findByTenSanPham(tenSanPham);
        if(oSP.isPresent()) return new SanPhamModel();
        return oSP.get();
    }

    public List<SanPhamModel> findByGia(Float gia){
        return sanPhamRepository.findByGia(gia);
    }

    public List<SanPhamModel> findByMaLoaiSanPham(int maLoaiSanPham){
        return sanPhamRepository.findByMaLoaiSanPham(maLoaiSanPham);
    }

    public boolean updateSanPham(SanPhamModel sanPham){
        try {
            return sanPhamRepository.updateSanPham(sanPham.getMaSanPham(), 
                                                   sanPham.getTenSanPham(),
                                                   sanPham.getGia(), 
                                                   sanPham.getMoTa(), 
                                                   sanPham.getHinhAnh(),
                                                   sanPham.getMaLoaiSanPham(),
                                                   sanPham.getMaUuDai());
        } catch (Exception e) {
            return false;
        }
    }

    public boolean insertSanPham(SanPhamModel sanPham){
        try {
            return sanPhamRepository.insertSanPham(sanPham.getTenSanPham(),
                                                   sanPham.getGia(), 
                                                   sanPham.getMoTa(), 
                                                   sanPham.getHinhAnh(),
                                                   sanPham.getMaLoaiSanPham(),
                                                   sanPham.getMaUuDai());
        } catch (Exception e) {
            return false;
        }
    }
}
