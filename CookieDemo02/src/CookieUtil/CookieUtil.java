package CookieUtil;

import javax.servlet.http.Cookie;

/**
 * @author ZhangHao
 * @date 2019/10/23 22:11
 * @Description： Cookie的工具类
 */
public class CookieUtil {


    /**
     * @Description:    从一个Cookie数组中找到我们具体想要的cookie对象.
     * @author          ZhangHao
     * @CreateDate:     2019/10/23 22:14
    */
    public static Cookie findCookie(Cookie[] cookies, String name) {
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (name.equals(cookie.getName())) {
                    return cookie;
                }
                
            }
        }

        return null;
    }
}
