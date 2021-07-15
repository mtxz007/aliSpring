package cn.sxt.test;

import cn.sxt.dao.impl.UserDaoMySqlImpl;
import cn.sxt.dao.impl.UserDaoOracleImpl;
import cn.sxt.service.impl.UserServiceImpl;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/12
 * Time: 9:53
 */
public class Test {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMySqlImpl());
        userService.getUser();
        System.out.println("------------------");
        userService.setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }
}
