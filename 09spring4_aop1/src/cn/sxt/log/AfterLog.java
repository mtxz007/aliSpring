package cn.sxt.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/24
 * Time: 10:37
 */
public class AfterLog implements AfterReturningAdvice {
    /**
     * 目标方法执行后执行的通知
     *
     * @param o       返回值
     * @param method  被调用的方法对象
     * @param objects 被调用的方法对象的参数
     * @param o1      被调用的方法对象的目标对象
     */
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println(o1.getClass().getName() + "的" + method.getName() + "被成功执行，返回值是：" + o);
    }
}
