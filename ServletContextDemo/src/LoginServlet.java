import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author： ZhangHao
 * @date： 2019/10/23 10:08
 * @Description：
 *
 *  request 包含请求的信息
 *  response 相应数据给浏览器
 */

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");


        PrintWriter pw = response.getWriter();


        if ("admin".equals(userName)&&"123456".equals(passWord)){
//            System.out.println("登录成功!!!");
//          pw.write("login success ");

            Object obj =  getServletContext().getAttribute("count");

            int oldCount=0;
            if (obj != null) {
                oldCount = (int)obj;
            }

            System.out.println("之前登录成功的次数是:"+oldCount);

            getServletContext().setAttribute("count",oldCount+1 );

//            设置状态码:302 代表重定位.
            response.setStatus(302);
//            成功就跳转到login_success.html
            response.setHeader("Location","login_success.html");

        }else {
//            System.out.println("登录失败!!");
            pw.write("login 失败 ");
        }


    }
}
