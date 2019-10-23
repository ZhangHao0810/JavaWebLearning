package ResponseDemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author： ZhangHao
 * @date： 2019/10/23 16:44
 * @Description：
 */
public class Response01 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        test(response);
//        test2(response);

//       设置响应的数据类型. 指定输出到客户端和客户端看数据时候的编码.相当于test2中的两行编码  不管是字符流还是字节流,这个都适用.
        response.setContentType("text/html;charset=UTF-8");

//        默认情况下这个方法使用utf-8的编码.可以在getbytes()中指定. 也可以指定输出,当setContentType之后,便无需写这个参数.
        response.getOutputStream().write("知识点那个".getBytes("utf-8"));

    }

    /**
     * @Description:    对字符数据进行防止乱码的设置(以字符流输出)
     * @author          ZhangHao
     * @CreateDate:     2019/10/23 17:53
    */
    private void test2(HttpServletResponse response) throws IOException {
        //        响应的数据中有中文,防止乱码:
//        指定输出到客户端的文字使用utf-8编码
        response.setCharacterEncoding("utf-8");
//        直接规定浏览器看这份数据的时候用什么编码来看
        response.setHeader("Content-Type","text/html;charset=UTF-8");
        response.getWriter().write("你好呀~~");
    }

    /**
     * @Description:    返回东西给客户端.
     * @author          ZhangHao
     * @CreateDate:     2019/10/23 17:49
    */
    private void test(HttpServletResponse response) throws IOException {
        //        以字符流方式写(只能写文字)
        response.getWriter().write("<h1>Hello Response!!!</>h1");
//        以字节流方式写
        response.getOutputStream().write("Hello 22222222222".getBytes());

    }
}
