package hello.servlet.basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="helloServlet", urlPatterns="/hello")
public class HelloServlet extends HttpServlet {
    // 오버라이딩 단축키 ctrl + O
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        super.service(req, resp);
        System.out.println("HelloServlet.service");
        System.out.println("request =>" + req);
        System.out.println("response =>" + res);

        // 요청 확인
        String userId = req.getParameter("userId");
        System.out.println("userId => " + userId);

        // 응답 보내기 - header 정보 생성
        res.setContentType("text/plain");
        res.setCharacterEncoding("utf-8");
        res.getWriter().write("hello : " + userId);
    }
}
