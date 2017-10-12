package me.maweiyi.spear.controller.admin;


import me.maweiyi.spear.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/admin")
public class AuthController extends BaseController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpServletResponse response) {
        return "admin/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLogin() {
        //用户进行登录，验证通过后将跳转到首页，同时将用户登录信息存储到redis
        return "XX";
    }
}
