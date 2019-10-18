package zhang;


import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author ZhangHao
 * @date 2019/10/18 20:41
 * @Description： 演示Servlet创建实例的时机
 */
public class HelloServlet04   implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

        System.out.println("初始化///////////////////");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
