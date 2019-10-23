package HttpServletRequestDemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author： ZhangHao
 * @date： 2019/10/23 16:18
 * @Description：
 */
public class Request02 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


//post请求写着一句话,就搞定啦,get不行的,因为get的信息保存在在地址栏中. 一定要写在getParameter之前.
        request.setCharacterEncoding("utf-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println(username + "****" + password);

        username = new String(username.getBytes("ISO-8859-1"), "UTF-8");
        System.out.println(username);


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        /**
         * @Description:    Get 请求过来的数据,在url地址栏上就进行编码了,所以取到的是乱码
         *  Tomcat收到数据, getParameter 默认使用ISO-8859-1 去解码
         * @author          ZhangHao
         * @CreateDate:     2019/10/23 16:31
        */
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println(username + "****" + password);

        username = new String(username.getBytes("ISO-8859-1"), "UTF-8");
        System.out.println(username);

    }
}
