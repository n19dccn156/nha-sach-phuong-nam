package KhanhVySang.demo.Controller.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import KhanhVySang.demo.Model.Form.SanPham.FormSanPham;
import KhanhVySang.demo.Repositories.Form.SanPham.ViewThongTinSanPham;

@Controller
@RequestMapping("/ad/sp")
public class PageQuanLySanPhamController {
    
    @Autowired
    private ViewThongTinSanPham viewThongTinSanPham;

    @GetMapping(path = "/")
    public String thongTinSanPhamGet(ModelMap model){

        List<FormSanPham> form = viewThongTinSanPham.findAll();
        model.addAttribute("sanpham", form);
        return "sanpham";
    }
}
