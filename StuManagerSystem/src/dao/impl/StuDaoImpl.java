package dao.impl;

import dao.StuDao;
import entity.Student;
import util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangHao
 * @date 2019/10/25 21:23
 * @Description： 学生操作类
 */
public class StuDaoImpl implements StuDao {

    @Override
    public List<Student> findAll() {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;

//       数据多了,用对象装,对象多了,用集合装
        List<Student> students = new ArrayList<>();

        try {
            conn = JDBCUtil.getConn();

            String sql = "select * from t_stu ";
            ps = conn.prepareStatement(sql);

            resultSet = ps.executeQuery();

            while (resultSet.next()) {
                Student stu = new Student();

                stu.setId(resultSet.getInt("id"));
                stu.setName(resultSet.getString("name"));
                stu.setAge(resultSet.getString("age"));
                stu.setGender(resultSet.getString("gender"));
                stu.setAddress(resultSet.getString("address"));

                students.add(stu);

//                System.out.println(students);
            }

        } catch (SQLException e) {
            System.out.println("sql出错哦");
        } finally {
            JDBCUtil.release(conn, ps, resultSet);
        }

        return students;
    }
}
