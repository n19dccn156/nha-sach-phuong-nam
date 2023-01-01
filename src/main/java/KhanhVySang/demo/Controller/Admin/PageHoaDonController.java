package KhanhVySang.demo.Controller.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import KhanhVySang.demo.Model.Form.HoaDon.FormHoaDonOnl;
import KhanhVySang.demo.Model.Form.HoaDon.FormThongTinHoaDon;
import KhanhVySang.demo.Repositories.Form.HoaDon.ViewHoaDonOnl;
import KhanhVySang.demo.Repositories.Form.HoaDon.ViewThongTinHoaDon;

@Controller
@RequestMapping("/ad/hd")
public class PageHoaDonController {
    
    @Autowired
    private ViewThongTinHoaDon viewThongTinHoaDon;
    @Autowired
    private ViewHoaDonOnl viewHoaDonOnl;

    @GetMapping(path = "/hoa-don-off/")
    public String taoHoaDonOff(){

        return "HDtaiquay";
    }

    @GetMapping(path = "/hoa-don-onl/")
    public String taoHoaDonOnl(ModelMap model){
        List<FormHoaDonOnl> form = viewHoaDonOnl.findByTenTrangThai("Đang Duyệt Đơn");
        model.addAttribute("hoadononl", form);
        return "HDonline";
    }

    @GetMapping(path = "/")
    public String danhSachHoaDon(ModelMap model){

        List<FormThongTinHoaDon> form = viewThongTinHoaDon.findAll();
        model.addAttribute("phieubanhang", form);
        

        return "hoadon";
    }
}
