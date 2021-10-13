package top.yxp2918.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yxp2918
 * @date 2021-10-12-20:03
 */
@Controller
public class test {
    // para这个形参就是请求参数的key 同名
    @RequestMapping("/hello")
    public String test1(String para){
        System.out.println(para);
        return "hello";
    }
    // 请求带的参数名和处理方法的参数名字不一样
    @RequestMapping("/hello2")
    public String test2(@RequestParam("username") String name){
        System.out.println(name);
        return "hello";
    }

    //接收的是一个对象
    @RequestMapping("/user")
    public String test3(User user){
        System.out.println(user.toString());
        return "hello";
    }
}
