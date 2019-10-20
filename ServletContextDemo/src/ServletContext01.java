import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author： ZhangHao
 * @date： 2019/10/19 23:01
 * @Description：
 *  每个Web程序都只有一个ServletContext对象.不管在哪个Servlet中获取的ServletContext,都是同一个对象.
 *
 */
@WebServlet(name = "ServletContext01")
public class ServletContext01 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        1. 获取ServletContext对象,
        ServletContext context=getServletContext();

//        2. 获取全局参数.
        String address = context.getInitParameter("address");
        System.out.println("address="+address);


    }
}
