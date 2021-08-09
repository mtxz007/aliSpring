package cn.sxt.test;

import cn.sxt.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/14
 * Time: 10:04
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService)applicationContext.getBean("userService");
        userService.delete();
    }
}
