package cn.sxt.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/16
 * Time: 11:10
 */
public class ProxyInovationHandler implements InvocationHandler {
    private Object target;  //目标对象--真实对象

    public void setTarget(Object target) {
        this.target = target;
    }

    /*
     * 生成代理类
     * */
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    /*
     * proxy  代理类
     * method 代理类的调用处理程序的方法对象
     * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    public void log(String methodName) {
        System.out.println("执行" + methodName + "方法");
    }

    //看房
    private void seeHouse() {
        System.out.println("带房客看房");
    }

    //收中介费
    private void fare() {
        System.out.println("收取中介费");
    }
}
