import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author： ZhangHao
 * @date： 2019/10/24 15:45
 * @Description：  购物车是Session,内容存在map中.
 */
public class CarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");


        int id = Integer.parseInt(request.getParameter("id"));
        String[] names = {"Iphone 5","Iphone 6","Iphone 7","Iphone 8","Iphone X","Iphone 11"};
        String name = names[id];

        Map<String,Integer> map= (Map<String, Integer>) request.getSession().getAttribute("car");

        if (map == null) {
            map = new LinkedHashMap<String, Integer>();
            request.getSession().setAttribute("car", map);
        }

        if (map.containsKey(name)) {
            map.put(name, map.get(name) + 1);
        } else {
            map.put(name, 1);
        }

        response.getWriter().write("<a href='product_list.jsp'><h3>继续购物</h3></a>");
        response.getWriter().write("<a href='car.jsp'><h3>去购物车结算.</h3></a>");
    }
}
