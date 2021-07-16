package cn.sxt.dynamicproxy;

import cn.sxt.service.UserService;
import cn.sxt.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/16
 * Time: 11:28
 */
public class Client {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//        ProxyInovationHandler proxyInovationHandler = new ProxyInovationHandler();
//        proxyInovationHandler.setTarget(userService);
//        UserService proxy = (UserService) proxyInovationHandler.getProxy();
//        proxy.add();
//        proxy.delete();

        ProxyInovationHandler proxyInovationHandler = new ProxyInovationHandler();
        proxyInovationHandler.setTarget(new ArrayList());
        List list = (List)proxyInovationHandler.getProxy();
        list.add("hello");
        list.remove("hello");
    }
}
