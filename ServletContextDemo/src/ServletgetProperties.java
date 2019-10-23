import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author： ZhangHao
 * @date： 2019/10/20 8:08
 * @Description：Servlet 获取资源文件.
 * <p>
 * 在Web工程中是无法利用输入输出流来读到工程中的文件的.
 *
 * getResourceAsStream() 获取Web工程下的资源,转化成流对象.
 */

public class ServletgetProperties extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        normalMethod();

//        test();

        test2();

    }

    /**
     * @Description:    根据类加载器获取工程下的资源,类加载器 JDBC
     *
     *      注意利用类加载器的相对路径的问题.文件一定能找对.
     * @author          ZhangHao
     * @CreateDate:     2019/10/23 9:53
    */
    private void test2() {
        try {
            Properties pro = new Properties();

            InputStream is = this.getClass().getClassLoader().getResourceAsStream("../../File/config.properties");
            pro.load(is);

            String address = pro.getProperty("address");
            System.out.println("address=" + address);
            is.close();

        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    /**
     * @Description:    根据相对路径获取流对象
     * @author          ZhangHao
     * @CreateDate:     2019/10/23 9:52
    */
    private void test() {
        try {

            //        获取ServletContext对象.
            ServletContext context = getServletContext();
            Properties pro = new Properties();
//            通过相对路径来获取.
            InputStream is = context.getResourceAsStream("File/config.properties");
            pro.load(is);
            String address = pro.getProperty("address");
            System.out.println("address=" + address);
            is.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * @Description:    先找到绝对路径
     * @author          ZhangHao
     * @CreateDate:     2019/10/23 9:52
    */
    private void normalMethod() throws IOException {
        //        获取ServletContext对象.
        ServletContext context = getServletContext();
//        获取给定的文件在服务器上面的绝对路径.这样就能找到资源了.
        String realPath = context.getRealPath("File/config.properties");
        System.out.println("path=" + realPath);

        Properties pro = new Properties();
        InputStream is = new FileInputStream(realPath);
        pro.load(is);

        String address = pro.getProperty("address");
        System.out.println("address=" + address);
    }
}
