package me.maweiyi.spear.controller.admin;

import me.maweiyi.spear.domain.Comments;
import me.maweiyi.spear.domain.Contents;
import me.maweiyi.spear.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
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
        Integer contentCount = siteService.staticContents();
        Integer attachCount = siteService.staticAttach();
        List<Contents> contents = siteService.contentTitle();
        Map map = new HashMap();
        map.put("articles", contentCount);
        map.put("comments", commentCount);
        map.put("attachs", attachCount);
        mv.addObject("statistics", map);
        mv.addObject("articles", contents);

        return mv;
    }





}
