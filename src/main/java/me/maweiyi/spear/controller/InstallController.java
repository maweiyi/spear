package me.maweiyi.spear.controller;

import me.maweiyi.spear.R;
import me.maweiyi.spear.domain.Option;
import me.maweiyi.spear.service.impl.OptionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.apache.log4j.*;

@Controller
@RequestMapping("/install")
public class InstallController extends BaseController {
    private static Logger LOGGER = LogManager.getLogger(InstallController.class);
    @Autowired
    private OptionServiceImpl optionService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView install() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("is_install", true);
        mv.setViewName("install");
        return mv;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public R doInstall(Option option) {
        try {
            optionService.insertOption(option);
        } catch (Exception e) {
            LOGGER.error("安装时发生服务器内部错误");
            return R.error("服务器内部错误");
        }
        return R.ok();
    }

}
