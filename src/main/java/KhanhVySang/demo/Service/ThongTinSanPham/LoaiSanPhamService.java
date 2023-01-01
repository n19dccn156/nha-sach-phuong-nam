package KhanhVySang.demo.Service.ThongTinSanPham;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KhanhVySang.demo.Model.Form.Catalog.FormThongTinLoaiSanPham;
import KhanhVySang.demo.Model.ThongTinSanPham.LoaiSanPhamModel;
import KhanhVySang.demo.Repositories.Form.Catalog.ViewThongTinLoaiSanPham;
import KhanhVySang.demo.Repositories.ThongTinSanPham.LoaiSanPhamRepository;

@Service
public class LoaiSanPhamService {
    
    @Autowired
    private LoaiSanPhamRepository loaiSanPhamRepository;
    @Autowired
    private ViewThongTinLoaiSanPham viewThongTinLoaiSanPham;

    public List<LoaiSanPhamModel> findAll(){
        return loaiSanPhamRepository.findAll();   
    }

    public LoaiSanPhamModel findByMaLoaiSanPham(int maLoaiSanPham) {
        Optional<LoaiSanPhamModel> oLSP = loaiSanPhamRepository.findByMaLoaiSanPham(maLoaiSanPham);
        if(oLSP.isEmpty()) return new LoaiSanPhamModel();
        return oLSP.get();
    }

    public LoaiSanPhamModel findByTenLoaiSanPham(String tenLoaiSanPham) {
        Optional<LoaiSanPhamModel> oLSP = loaiSanPhamRepository.findByTenLoaiSanPham(tenLoaiSanPham);
        if(oLSP.isEmpty()) return new LoaiSanPhamModel();
        return oLSP.get();
    }

    public List<LoaiSanPhamModel> findByTrangThai(boolean trangThai) {
        return loaiSanPhamRepository.findByTrangThai(trangThai);
    }

    public List<FormThongTinLoaiSanPham> findAllByForm(){
        return viewThongTinLoaiSanPham.findAll();
    }

    public List<FormThongTinLoaiSanPham> findFormByTrangThai(boolean trangThai){
        return viewThongTinLoaiSanPham.findByTrangThai(trangThai);
    }

    public boolean updateLoaiSanPham(LoaiSanPhamModel lsp){
        try {
            return loaiSanPhamRepository.updateLoaiSanPham(lsp.getMaLoaiSanPham(), 
                                                           lsp.getTenLoaiSanPham(), 
                                                           lsp.getTrangThai(), 
                                                           lsp.getMaDanhMuc());
        } catch (Exception e) {
            return false;
        }
    }

    public boolean insertLoaiSanPham(LoaiSanPhamModel lsp){
        try {
            return loaiSanPhamRepository.insertLoaiSanPham(lsp.getTenLoaiSanPham(), 
                                                           lsp.getTrangThai(), 
                                                           lsp.getMaDanhMuc());
        } catch (Exception e) {
            return false;
        }
    }
}
