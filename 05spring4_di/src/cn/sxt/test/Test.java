package cn.sxt.test;

import cn.sxt.vo.Student;
import cn.sxt.vo.User;
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
        Student student = (Student)applicationContext.getBean("student");
        student.show();
        User user = (User)applicationContext.getBean("user");
        System.out.println(user);
        User user1 = (User)applicationContext.getBean("u1");
        System.out.println(user1);
    }
}
