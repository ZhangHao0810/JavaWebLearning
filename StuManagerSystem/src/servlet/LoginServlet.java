package servlet;

import dao.StuDao;
import dao.UserDao;
import dao.impl.StuDaoImpl;
import dao.impl.UserDaoImpl;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author： ZhangHao
 * @date： 2019/10/24 19:31
 * @Description： 用于处理登录的Servlet
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        处理中文乱码问题
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

//       1. 获取客户端提交的信息
        String username = request.getParameter("username");
        String password = request.getParameter("password");

//       2. 访问dao,看是否合格
        UserDao userDao = new UserDaoImpl();
        boolean isSuccess = userDao.login(username, password);

//        根据dao的结果,做出响应
        if (isSuccess) {
//            查询出来所有的学生信息,
            StuDao student = new StuDaoImpl();
            List<Student> students = student.findAll();

            System.out.println(students);

            request.getSession().setAttribute("students",students);

            response.sendRedirect("stu_list.jsp");
        } else {
            response.getWriter().write("用户名或者密码错误!!");
        }

    }
}
