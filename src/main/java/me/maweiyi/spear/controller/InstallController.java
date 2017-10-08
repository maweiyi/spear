package me.maweiyi.spear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InstallController extends BaseController {

    @RequestMapping("/")
    public ModelAndView install() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("is_install", true);
        mv.setViewName("install");
        return mv;
    }

}
