import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author： ZhangHao
 * @date： 2019/10/24 16:15
 * @Description：    清空购物车的写法
 */
public class ClearCar extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

//        把这个会话(session)给干掉!,session中存的所有的数据都没了.
        session.invalidate();

//        从Session中移出某个Attribute,但是这个session还在
        session.removeAttribute("car");

        response.sendRedirect("car.jsp");
    }
}
