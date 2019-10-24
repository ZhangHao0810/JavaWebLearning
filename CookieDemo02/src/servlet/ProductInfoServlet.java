package servlet;

import CookieUtil.CookieUtil;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author： ZhangHao
 * @date： 2019/10/24 8:41
 * @Description：
 */
public class ProductInfoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        获取当前用户准备浏览的商品id
        String id = request.getParameter("id");

        Cookie[] cookies = request.getCookies();

        Cookie cookie = CookieUtil.findCookie(cookies, "history");

        if (cookie == null) {
            Cookie c = new Cookie("", id);

            c.setMaxAge(60*60*24*7);
            response.addCookie(c);
        } else {
            String ids = cookie.getValue();
            cookie.setValue(id + "#" + ids);

            cookie.setMaxAge(60*60*24*7);
            response.addCookie(cookie);
        }
        response.sendRedirect("product_info.htm");

    }
}
