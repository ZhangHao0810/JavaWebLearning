package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import com.itheima.util.JDBCUtil02;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;

public class UserDaomImpl implements UserDao{

	@Override
	public boolean checkUserName(String username) throws SQLException {

		QueryRunner runner = new QueryRunner(JDBCUtil02.getDataSource());
		
		String sql = "select count(*) from t_stu where name =?";
		
//		ScalarHandler() 这个是用作聚合函数的,就是返回的是
		runner.query(sql, new  ScalarHandler(), username);
		
		Long result = (Long) runner.query(sql, new  ScalarHandler(), username); 
		return result > 0 ;
	}

}
