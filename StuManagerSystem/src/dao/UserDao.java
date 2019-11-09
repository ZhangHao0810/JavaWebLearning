package dao;

/**
 * @author ZhangHao
 * @date 2019/10/24 19:41
 * @Description： UserDao 定义了对用户表的访问规则.
 */
public interface UserDao {

    /**
     * @author Zhanghao
     * @date 2019/10/24 20:09
     *
     * @param username
     * @param password
     * @return boolean  true 成功,false 失败
     * @Description:      正式开发的时候,登陆的方法,成功之后,一般要返回该用户的个人信息.
    */
    boolean login(String username,String password);
}
