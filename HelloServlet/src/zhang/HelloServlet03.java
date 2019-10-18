package zhang;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import java.io.IOException;

/**
 * @author ZhangHao
 * @date 2019/10/18 20:16
 * @Description： Servlet的生命周期
 *
 * 用于演示Servlet的生命周期调用的时候使用,日常不会手动实现Servlet接口.
 */
public class HelloServlet03 implements Servlet {

    /**
     * @Description:    创建Servlet实例的时候,执行该方法. 默认情况是,初次访问该Servlet时才会创造该实例.
     *  init方法只会初始化一次.
     * @author          ZhangHao
     * @CreateDate:     2019/10/18 20:31
    */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Servlet03 初始化了 ................");
    }


    /**
     * @Description:    只要客户端来了一个请求(request) 就调用这个方法.
     * @author          ZhangHao
     * @CreateDate:     2019/10/18 20:33
    */
    @Override
    public void service(ServletRequest servletRequest, javax.servlet.ServletResponse servletResponse) throws ServletException, IOException {

    }


/**
 * @Description:    Servlet销毁的时候,就会执行该方法.
 * 1.将此Servlet从Tomcat中取消托管.(Application Servers  选中一个Servlet --remove)
 * 2.正常关闭Tomcat  shutdown.bat
 *
 * @author          ZhangHao
 * @CreateDate:     2019/10/18 20:34
*/
    @Override
    public void destroy() {

    }
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }



    @Override
    public String getServletInfo() {
        return null;
    }

}
