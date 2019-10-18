package zhang;

import java.io.IOException;

/**
 * @author ZhangHao
 * @date 2019/10/18 15:30
 * @Description： Servlet的Demo类
 * <p>
 * 因为实现一个接口,就要实现他的所有方法.
 * 但是有的时候我不想实现.所以我们可以用到继承,
 * 继承这个接口的实现类,然后重写这个实现类中我想要的方法.
 */
public class HelloServlet implements javax.servlet.Servlet {

    @Override
    public void init(javax.servlet.ServletConfig servletConfig) throws javax.servlet.ServletException {

    }

    @Override
    public javax.servlet.ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(javax.servlet.ServletRequest servletRequest, javax.servlet.ServletResponse servletResponse) throws javax.servlet.ServletException, IOException {

        System.out.println("Hello Servlet ..........");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
