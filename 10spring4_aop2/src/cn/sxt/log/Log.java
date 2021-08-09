package cn.sxt.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/8/9
 * Time: 9:46
 */
public class Log  {
    public void before()  {
        System.out.println("--------方法执行前--------");
    }
    public void after()  {
        System.out.println("--------方法执行后--------");
    }
}
