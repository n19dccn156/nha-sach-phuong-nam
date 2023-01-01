package KhanhVySang.demo.Service.ThongTinCaNhan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KhanhVySang.demo.Model.ThongTinCaNhan.GioHangModel;
import KhanhVySang.demo.Repositories.ThongTinCaNhan.GioHangRepository;
@Service
public class GioHangService {
    
    @Autowired 
    private GioHangRepository gioHangRepository;

    public List<GioHangModel> findAll(){
        return gioHangRepository.findAll();
    }

    public List<GioHangModel> findByMaKhachHang(int maKhachHang){
        return gioHangRepository.findByMaKhachHang(maKhachHang);
    }

    public boolean insertGioHang(GioHangModel gioHang){        
        try {
            return gioHangRepository.insertGioHang(gioHang.getMaKhachHang(), 
                                                   gioHang.getMaSanPham(), 
                                                   gioHang.getSoLuong());
        } catch (Exception e) {
            return false;
        }
    }

    public boolean deleteGioHang(GioHangModel gioHang){
        try {
            return gioHangRepository.deleteGioHang(gioHang.getMaKhachHang(), 
                                                    gioHang.getMaSanPham());
        } catch (Exception e) {
            return false;
        }
    }

    public boolean updateGioHang(GioHangModel gioHang){
        try {
            return gioHangRepository.updateGioHang(gioHang.getMaKhachHang(), 
                                                    gioHang.getMaSanPham(), 
                                                    gioHang.getSoLuong());
        } catch (Exception e) {
            return false;
        }
    }
}
