package dao.impl;

import dao.UserDao;
import util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ZhangHao
 * @date 2019/10/24 19:44
 * @Description： 访问用户表的实现类.
 */
public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(String username,String password) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        try {
//            得到连接对象
            conn = JDBCUtil.getConn();

            String sql = "select * from t_user where username= ? and password= ?";
//            创建ps对象
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);

//            开始执行
            resultSet = ps.executeQuery();
//            如果能够成功移到下一条记录,说明有这个用户
            return resultSet.next();

        } catch (SQLException e) {
            System.out.println("sql出错哦");
        } finally {
            JDBCUtil.release(conn,ps,resultSet);
        }
//        不出问题,finally一定会执行.

        return false;

    }
}
