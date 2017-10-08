package me.maweiyi.spear.controller;

import me.maweiyi.spear.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("install")
public class InstallController extends BaseController {

    @RequestMapping("/")
    public ModelAndView install() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("is_install", true);
        mv.setViewName("install");
        return mv;
    }

    @RequestMapping("/")
    @ResponseBody
    public R doInstall(HttpServletRequest request) {
        return R.ok();
    }

}
