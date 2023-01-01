package KhanhVySang.demo.Controller.Public;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/pl")
public class PageSanPhamController {

    @GetMapping(value="/sp/view")
    public String getMethodName() {
        return "sanpham";
    }

    
}
