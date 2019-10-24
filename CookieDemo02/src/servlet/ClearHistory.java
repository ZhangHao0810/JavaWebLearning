package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author： ZhangHao
 * @date： 2019/10/24 14:15
 * @Description：  删除cookie没有delet 只有设置cookie的时间为0.
 */
public class ClearHistory extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie cookie = new Cookie("history", "");
        //设置立即删除cookie
        cookie.setMaxAge(0);
        cookie.setPath("/CookieDemo02");
        response.addCookie(cookie);

        response.sendRedirect("product_list.jsp");
    }
}
