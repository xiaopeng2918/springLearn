package top.yxp2918.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yxp2918
 * @date 2021-10-12-12:39
 */
@Controller
public class RestfulController{

    @RequestMapping("/test/{p1}/{p2}")
    public String index(@PathVariable int p1, @PathVariable int p2, Model model){
        model.addAttribute("result",p1 + p2);
        return "test";
    }

    @RequestMapping(value = "/test",method = {RequestMethod.GET})
    public String index(Model model){
        model.addAttribute("result",666);
        return "test";
    }

}
