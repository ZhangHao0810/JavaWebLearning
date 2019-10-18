package zhang;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author ZhangHao
 * @date 2019/10/18 20:54
 * @Description：  ServletConfig api 用于获取配置文件信息.
 */
public class HelloServletConfig extends javax.servlet.http.HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        可以获取Servlet在配置的时候的一些信息.

//        得到配置对象.
        ServletConfig servletConfig = getServletConfig();

//          ServletName 得到的是配置文件的ServletName <servlet-name>后的文本内容.
        String servletName = servletConfig.getServletName();
        System.out.println("ServletName="+servletName);

        String initParameter = servletConfig.getInitParameter("address");
        System.out.println("address="+initParameter);

//        3. 获取所有的参数名称,并遍历输出.
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            String key = initParameterNames.nextElement();

            String value = servletConfig.getInitParameter(key);

            System.out.println(key+"="+ value);
        }

    }
}
