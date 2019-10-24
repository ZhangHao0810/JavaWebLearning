import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author： ZhangHao
 * @date： 2019/10/23 20:11
 * @Description： Cookie的简单使用
 * 添加cookie之后,响应头中多了字段: Set-Cookie
 * <p>
 * cookie是服务器生成,存储在客户端
 */
public class CookieDemo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
//        给响应添加一个cookie

        Cookie cookie = new Cookie("aa", "bb");
        response.addCookie(cookie);

//        获取Cookie 返回是个数组.
        Cookie[] cookies = request.getCookies();
        if (cookie != null) {
            for (Cookie c : cookies) {
                String name = c.getName();
                String value = c.getValue();

                System.out.println(name + "=" + value);

            }
        }

    }
}
