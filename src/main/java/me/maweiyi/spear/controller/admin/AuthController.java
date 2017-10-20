package me.maweiyi.spear.controller.admin;


import me.maweiyi.spear.R;
import me.maweiyi.spear.controller.BaseController;
import me.maweiyi.spear.controller.InstallController;
import me.maweiyi.spear.service.AuthService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.session.security.SpringSessionBackedSessionRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;


@SuppressWarnings("ALL")
@Controller
@RequestMapping("/admin")
public class AuthController extends BaseController {

    @Autowired
    private AuthService authService;

    private static Logger LOGGER = LogManager.getLogger(AuthController.class);
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpServletResponse response) {
        return "admin/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public R doLogin(HttpServletRequest request, @RequestParam("username") String username, @RequestParam("password") String password, @RequestParam(value = "remeberMe", required = false) String remeberMe) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        //用户进行登录，验证通过后将跳转到首页，同时将用户登录信息存储到redis
        try {

            if (authService.checkLogin(username, password)) {
                System.out.println("SDSDS");
                request.getSession().setAttribute("user", username);
                return R.ok("登录成功", true);

            }
           return R.error("登录失败", false);
        } catch (Exception e) {
            return R.error("登录失败", false);
        }

    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public void logOut(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            request.getSession().invalidate();
        } catch (Exception e) {
            LOGGER.error("注销失败");
        }
        response.sendRedirect("/admin/login");

    }
}
