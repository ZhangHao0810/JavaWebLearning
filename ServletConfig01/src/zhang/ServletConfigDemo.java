package zhang;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author： ZhangHao
 * @date： 2019/10/18 21:23
 * @Description：
 */

public class ServletConfigDemo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        获取Servlet配置的参数.

        System.out.println("11111111111111111111");


        ServletConfig servletConfig = getServletConfig();

        String number = servletConfig.getInitParameter("number");
        if (number == null) {
            throw new IllegalArgumentException("servlet 在配置的时候一定要写number这个参数.");
        } else {
            System.out.println("number.............");
        }
    }
}
