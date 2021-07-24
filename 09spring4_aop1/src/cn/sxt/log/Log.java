package cn.sxt.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/24
 * Time: 9:46
 */
public class Log implements MethodBeforeAdvice {
    /**
     * @param method  被调用的方法对象
     * @param objects 被调用的方法的参数
     * @param o       被调用的方法的目标对象
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName() + "的" + method.getName() + "方法被执行");
    }
}
