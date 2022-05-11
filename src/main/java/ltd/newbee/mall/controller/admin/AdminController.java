package ltd.newbee.mall.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 13
 * @qq交流群 796794009
 * @email 2449207463@qq.com
 * @link https://github.com/newbee-ltd
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/indexAll")
    public String indexAll() {
        return "admin/index-all";
    }

    @GetMapping("/index")
    public String index(HttpServletRequest request) {
        request.setAttribute("path", "index");
        return "admin/index";
    }

    @GetMapping("/category")
    public String category(HttpServletRequest request) {
        request.setAttribute("path", "category");
        return "admin/category";
    }

}
