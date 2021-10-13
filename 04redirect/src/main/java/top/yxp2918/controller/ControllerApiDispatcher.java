package top.yxp2918.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * HttpServletResponse实现输出
 * HttpServletResponse实现重定向
 * HttpServletResponse实现转发
 * @author yxp2918
 * @date 2021-10-12-17:58
 */
@Controller
public class ControllerApiDispatcher {
    // 输出
    @RequestMapping("/t1")
    public void test1(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println("t1");

    }

    // 重定向
    @RequestMapping("/t2")
    public void test2(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/04doData_war/index.jsp");
    }

    // 这个有问题
    @RequestMapping("/t3")
    public void test3(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/04doData_war/WEB-INF/jsp/test1.jsp").forward(req, resp);
    }
}
