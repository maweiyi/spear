package me.maweiyi.spear.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author MWY
 * @date 10/21/17
 */
@Controller
@RequestMapping("/admin/article")
public class ArticleController {

    @RequestMapping("/publish")
    public ModelAndView newArticle() {
        ModelAndView mv = new ModelAndView("/admin/article_edit");
        return mv;
    }
}
