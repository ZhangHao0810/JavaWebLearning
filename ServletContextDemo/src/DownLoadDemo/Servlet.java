package DownLoadDemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author： ZhangHao
 * @date： 2019/10/23 18:48
 * @Description：
 *
 *  设置手动下载,弹出窗体.
 *          用字节流.然后需要设置头.
 */
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String filename = request.getParameter("filename");

//        获取在服务器中的真实路径
        String path = getServletContext().getRealPath("img/" + filename);

//        要想在浏览器弹出下载窗口,还要设置头
        response.setHeader("Content-Disposition","attachment;filename="+filename);

        InputStream is = new FileInputStream(path);
        OutputStream os=response.getOutputStream();

        int len=0;
        byte[] buffer = new byte[1024];
        while((len=is.read(buffer))!=-1){
            os.write(buffer,0,len);
        }

        is.close();
        os.close();


    }
}
