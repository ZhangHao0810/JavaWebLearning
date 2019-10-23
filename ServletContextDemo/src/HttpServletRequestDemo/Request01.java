package HttpServletRequestDemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author： ZhangHao
 * @date： 2019/10/23 15:18
 * @Description：
 */
public class Request01 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        得到一个枚举集合
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String name =headerNames.nextElement();
            String value = request.getHeader(name);
            System.out.println(name+"="+value);
        }

        System.out.println("============================");

        String name = request.getParameter("name");
        System.out.println("name="+name);
        System.out.println("===========================");

        //因为一个key对应多个value,所以value那边是一个数组.
        Map<String, String[]> map = request.getParameterMap();
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key =  iterator.next();
            String value = map.get(key)[0];

            System.out.println(key+"=="+value);

        }

    }
}
