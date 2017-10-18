package me.maweiyi.spear.controller.admin;

import me.maweiyi.spear.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class IndexController {

    @Autowired
    private SiteService siteService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index() {

        ModelAndView mv = new ModelAndView("admin/index");
        Integer commentCount = siteService.staticComments();
        Map map = new HashMap();
        map.put("articles", 0);
        map.put("comments", commentCount);
        map.put("attachs", 0);
        mv.addObject("statistics", map);

        return mv;
    }





}
