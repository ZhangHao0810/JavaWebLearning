import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author： ZhangHao
 * @date： 2019/10/23 19:44
 * @Description：
 *
 *      请求转发和重定向的区别:
 *          请求转发:买可乐,老板没有,老板自己去买回来给我(只能去自己项目找),效率高
 *          重定向: 买可乐,老板没有,让我去别家买.(可以跳转到任意路径),效率低一些.
 *
 */
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "123".equals(password)) {
//            重定向:浏览器有两次请求,浏览器去浏览另一个页面
            response.sendRedirect("login_success.html");
//            请求转发:浏览器只有一次请求,还是原来的地址,但显示不同的页面
            request.getRequestDispatcher("login_success.html").forward(request,response);
        } else {
            response.getWriter().write("登录失败!!");
        }


    }
}
