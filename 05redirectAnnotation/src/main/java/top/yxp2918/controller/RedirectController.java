package top.yxp2918.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 转发与重定向
 * @author yxp2918
 * @date 2021-10-12-19:47
 */
@Controller
public class RedirectController {
    @RequestMapping("/yxp/t1")
    public String test1(){
        // 转发一
        return "/index.jsp";
    }

    @RequestMapping("/yxp/t2")
    public String test2(){
        // 转发二
        return "forward:/index.jsp";
    }

    @RequestMapping("/yxp/t3")
    public String test3(){
        return "redirect:/index.jsp";
    }
}
