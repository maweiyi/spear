package me.maweiyi.spear.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class IndexController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("admin/index");
        Map map = new HashMap();
        map.put("articles", 0);
        map.put("comments", 0);
        map.put("attachs", 0);
        mv.addObject("statistics", map);
        return mv;
    }
}
