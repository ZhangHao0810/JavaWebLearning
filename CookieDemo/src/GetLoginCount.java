import CookieUtil.CookieUtil;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @author： ZhangHao
 * @date： 2019/10/23 20:40
 * @Description：
 */
public class GetLoginCount extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123".equals(password)) {
            response.getWriter().write("欢迎您" + username);

            Cookie[] cookies = request.getCookies();

//            从数组中找到想要的Cookie
            Cookie cookie = CookieUtil.findCookie(cookies, "last");
            if (cookie == null) {
                Cookie cook = new Cookie("last", System.currentTimeMillis() + "");
                //有效期一个小时
                cook.setMaxAge(60 * 60);
                response.addCookie(cook);
            } else {
//                第二次登陆
                Long lastTime = Long.parseLong(cookie.getValue());
//                输出到界面
                response.getWriter().write("欢迎您," + username +",上次来访时间是:"+ new Date(lastTime));
//                重置登陆时间
                cookie.setValue(System.currentTimeMillis() + "");
                response.addCookie(cookie);
            }

        } else {
            response.getWriter().write("登录失败!!");
        }
    }
}
