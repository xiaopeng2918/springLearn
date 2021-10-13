package top.yxp2918.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author yxp2918
 * @date 2021-10-12-21:59
 */
@Controller
public class Form {
    @RequestMapping(value = "/e/t")
    public String test(Model model,String name){
        model.addAttribute("msg", name);
        System.out.println(name);
        return "test";
    }
}
