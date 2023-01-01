package KhanhVySang.demo.Service.ThongTinSanPham;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KhanhVySang.demo.Model.ThongTinSanPham.DanhMucModel;
import KhanhVySang.demo.Repositories.ThongTinSanPham.DanhMucRepository;

@Service
public class DanhMucService {
    @Autowired
    private DanhMucRepository danhMucRepository;


    public List<DanhMucModel> findAll(){
        return danhMucRepository.findAll();   
    }

    public DanhMucModel findByMaDanhMuc(int maDanhMuc) {
        Optional<DanhMucModel> oDM = danhMucRepository.findByMaDanhMuc(maDanhMuc);
        if(oDM.isEmpty()) return new DanhMucModel();
        return oDM.get();
    }

    public DanhMucModel findByTenDanhMuc(String tenDanhMuc) {
        Optional<DanhMucModel> oDM = danhMucRepository.findByTenDanhMuc(tenDanhMuc);
        if(oDM.isEmpty()) return new DanhMucModel();
        return oDM.get();
    }

    public List<DanhMucModel> findByTrangThai(boolean trangThai) {
        return danhMucRepository.findByTrangThai(trangThai);
    }

    public boolean updateDanhMuc(DanhMucModel danhMuc){
        try {
            return danhMucRepository.updateDanhMuc(danhMuc.getMaDanhMuc(), 
                                                   danhMuc.getTrangThai(), 
                                                   danhMuc.getTenDanhMuc());
        } catch (Exception e) {
            return false;
        }
    }

    public boolean insertDanhMuc(DanhMucModel danhMuc){
        try {
            return danhMucRepository.insertDanhMuc(danhMuc.getTenDanhMuc(), danhMuc.getTrangThai());
        } catch (Exception e) {
            return false;
        }
    }
}
