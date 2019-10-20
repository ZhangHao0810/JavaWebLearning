import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author： ZhangHao
 * @date： 2019/10/20 8:08
 * @Description：Servlet 获取资源文件.
 */

public class ServletgetProperties extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        获取ServletContext对象.
        ServletContext context = getServletContext();
//        获取给定的文件在服务器上面的绝对路径.
        String realPath = context.getRealPath("File/config.properties");
        System.out.println("path="+realPath);



    }
}
