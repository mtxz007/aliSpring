package cn.sxt.test;

import cn.sxt.vo.User;
import cn.sxt.vo.User2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/13
 * Time: 11:06
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans3.xml");
        User2 user2 = (User2)applicationContext.getBean("user1");
        user2.show();
    }
}
