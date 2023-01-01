package KhanhVySang.demo.Controller.Public;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import KhanhVySang.demo.Service.ThongTinCaNhan.TaiKhoanService;

@Controller
@RequestMapping(path = "/pl")
public class CuaHangController {
    
    @Autowired
    private TaiKhoanService taiKhoanService;

    @GetMapping(path = "/trangchu")
    public String trangChu(HttpSession session){
        if(session.getAttribute("isLogin") == "true") return "index";
        return "redirect:/pl/login";
    }

    @GetMapping(path = "/test")
    public String trangChutr(HttpSession session){

        return "test";
    }

    // @GetMapping(path = "/login")
    // public String loginGet(HttpSession session){
    //     if(session.getAttribute("isLogin") == "true") return "index";
    //     return "login";
    // }

    // @PostMapping(path = "/login")
    // public String loginPost(@ModelAttribute("formDangNhap") FormDangNhap form, 
    //                         ModelMap model, HttpSession session, 
    //                         HttpServletResponse response){
        
    //    String tenDangNhap = form.getTenDangNhap();
    //    String matKhau = form.getMatKhau();
    //    String luuDangNhap = form.getLuuDangNhap();
       
    //    TaiKhoanModel taiKhoan = taiKhoanService.findByTenDangNhapAndMatKhau(tenDangNhap, matKhau);
        
    //    if(taiKhoan != new TaiKhoanModel()) {
    //         //session.setAttribute("tenDangNhap", tenDangNhap);
    //         //session.setAttribute("matKhau", matKhau);
    //         session.setAttribute("isLogin", "true");

    //         ChucVuModel author = chucVuService.findByMaChucVu(taiKhoan.getMaChucVu());

    //         session.setAttribute("author", author.getTenChucVu());
    //    }
    //     return "redirect:/pl/trangchu";
    // }
}
