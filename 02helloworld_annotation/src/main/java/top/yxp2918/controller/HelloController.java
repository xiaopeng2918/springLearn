package top.yxp2918.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @Controller是为了让Spring IOC容器初始化时自动扫描到；
 *
 * @RequestMapping  是为了映射请求路径，这里因为类与方法上都有映射所以访问时应该是/HelloController/hello；
 *
 * 方法中声明Model类型的参数是为了把Action中的数据带到视图中；
 *
 * 方法返回的结果是视图的名称hello，加上配置文件中的前后缀变成WEB-INF/jsp/hello.jsp。
 * @author yxp2918
 * @date 2021-10-12-8:43
 */
@Controller
@RequestMapping("HelloController")
public class HelloController{
    @RequestMapping("hello")
    public String sayHello(Model model){
        model.addAttribute("name","helloMvc");
        return "hello";
    }
}
