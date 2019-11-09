package dao;

import entity.Student;

import java.util.List;

/**
 * @author ZhangHao
 * @date 2019/10/25 21:17
 * @Description： 学生Dao
 */
public interface StuDao {

/**
 * @author Zhanghao
 * @date 2019/10/25 21:22
 * 
 * @param 	
 * @return java.util.List<entity.Student>
 * @Description: 查询出所有的学生信息.
*/
    List<Student> findAll();
}
