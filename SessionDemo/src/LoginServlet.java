import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author： ZhangHao
 * @date： 2019/10/24 15:34
 * @Description：        Session 放置到了Cookie里面. 他是基于Cookie的.
 *  request.getSession() 创建.
 *  默认有效期 30分钟.
 *  可以持久  redis.关了浏览器还是存在.
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        String sessionId = request.getSession().getId();

        response.getWriter().write("收到请求:::::::");
    }
}
