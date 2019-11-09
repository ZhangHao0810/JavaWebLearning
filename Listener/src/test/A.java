package test;

/**
 * @author ZhangHao
 * @date 2019/10/29 20:19
 * @Description：
 *  加入这个方法在早先就写好了,不知道未来B类.
 */
public class A {

    public void print(){
        for (int i = 0; i < 10; i++) {
            System.out.println("到了:---");
            if (i == 5) {
                System.out.println("5了,通知B");
            }

        }
    }
}
