package cn.sxt.test;

import cn.sxt.bean.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/12
 * Time: 11:22
 */
public class Test {
    public static void main(String[] args) {
        //解析beans.xml文件 生成管理相应的bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Hello hello = (Hello) context.getBean("h4");
        Hello hello = context.getBean(Hello.class);
        hello.show();
    }
}
/*Hello对象是由spring容器创建的
* Hello对象属性是spring容器来设置的
* 这个过程就叫控制反转：
* 控制：指 谁来控制对象 的创建；传统的应用程序的对象的创建是由程序本身控制的。
* 使用spring后，是由spring来创建对象的。 为了实现解耦等
* 反转：正传指程序来创建对象，反转指程序本身不去创建对象，而变为被动接受的对象
*
* 总结：以前对象是由程序本身来创建，使用spring后，程序变为被动接收spring创建好的对象。
* 控制反转----依赖注入（dependency injection）
* Ioc是一种编程思想。由主动的编程变为被动的接收；
* Ioc的实现是通过ioc容器来实现的，Ioc容器----BeanFactory*/
