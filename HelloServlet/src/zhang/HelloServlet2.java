package zhang;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ZhangHao
 * @date 2019/10/18 20:03
 * @Description： demo2
 *  不实现Servlet接口,而是继承 HttpServlet 类.
 *  要做的不是重写service,而是重写 doget  dopost
 *  因为父类本来就有service方法,方法内调用了doget和dopost.
 */
public class HelloServlet2 extends javax.servlet.http.HttpServlet {
/*    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet 02........");
    }*/

/**
 * @author Zhanghao
 * @date 2019/10/18 20:12
 * @Description: Get 请求来这个方法.
*/
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get.....");

    }

    /**
     * @Description:    post请求会来这个方法.
     * @author          ZhangHao
     * @CreateDate:     2019/10/18 20:12
    */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post.........");
    }
}
