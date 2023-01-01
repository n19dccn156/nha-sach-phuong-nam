package KhanhVySang.demo.Controller.API;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import KhanhVySang.demo.Model.Form.HoaDon.FormChiTietHoaDon;
import KhanhVySang.demo.Model.Form.HoaDon.FormThongTinHoaDon;
import KhanhVySang.demo.Model.Form.NhapHang.FormChiTietNhapHang;
import KhanhVySang.demo.Model.Form.TraHang.FormChiTietTraHang;
import KhanhVySang.demo.Repositories.Form.HoaDon.ViewChiTietHoaDon;
import KhanhVySang.demo.Repositories.Form.HoaDon.ViewThongTinHoaDon;
import KhanhVySang.demo.Repositories.Form.NhapHang.ViewChiTietNhapHang;
import KhanhVySang.demo.Repositories.Form.TraHang.ViewChiTietTraHang;

@RestController
@RequestMapping("/api")
public class testAPI {
    
    @Autowired
    private ViewThongTinHoaDon viewThongTinHoaDon;
    @Autowired
    private ViewChiTietNhapHang viewChiTietNhapHang;
    @Autowired
    private ViewChiTietHoaDon viewChiTietHoaDon;
    @Autowired
    private ViewChiTietTraHang viewChiTietTraHang;

    @GetMapping(path = "/hoadon/{maPhieuBanHang}")
    public ResponseEntity<FormThongTinHoaDon> hoaDonAPI(@PathVariable int maPhieuBanHang){
        Optional<FormThongTinHoaDon> form = viewThongTinHoaDon.findByMaPhieuBanHang(maPhieuBanHang);
        if(form.isPresent()) return ResponseEntity.status(HttpStatus.OK).body(form.get());
        else return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @GetMapping(path = "/chitiethoadon/{maPhieuBanHang}")
    public ResponseEntity<List<FormChiTietHoaDon>> chiTietHoaDonAPI(@PathVariable int maPhieuBanHang){
        
        List<FormChiTietHoaDon> form = viewChiTietHoaDon.findByMaHoaDon(maPhieuBanHang);
        if(form.isEmpty()) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        else return ResponseEntity.status(HttpStatus.OK).body(form);
    }


    @GetMapping(path = "/chitietnhaphang/{maPhieuNhapHang}")
    public ResponseEntity<List<FormChiTietNhapHang>> ChiTietNhapHangAPI(@PathVariable int maPhieuNhapHang){
        
        List<FormChiTietNhapHang> form = viewChiTietNhapHang.findByMaPhieuNhapHang(maPhieuNhapHang);
        if(form.isEmpty()) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        else return ResponseEntity.status(HttpStatus.OK).body(form);
    }


    @GetMapping(path = "/chitiettrahang/{maPhieuTraHang}")
    public ResponseEntity<List<FormChiTietTraHang>> ChiTietTraHangAPI(@PathVariable int maPhieuTraHang){
        
        List<FormChiTietTraHang> form = viewChiTietTraHang.findByMaPhieuTraHang(maPhieuTraHang);
        if(form.isEmpty()) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        else return ResponseEntity.status(HttpStatus.OK).body(form);
    }
}
