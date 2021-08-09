package cn.sxt.log;

import org.springframework.aop.ThrowsAdvice;

import java.rmi.RemoteException;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/8/9
 * Time: 12:27
 */
public class ExceptionLog implements ThrowsAdvice {
    public void afterThrowing(RemoteException ex) throws Throwable {
    }
}
