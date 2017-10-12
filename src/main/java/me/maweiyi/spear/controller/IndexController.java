package me.maweiyi.spear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/indexs")
    public String index() {
        return "admin/indexs";
    }
}
