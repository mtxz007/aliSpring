package cn.sxt.service.impl;

import cn.sxt.service.UserService;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/16
 * Time: 11:26
 */
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("------增加用户------");
    }


    @Override
    public int delete() {
        System.out.println("--------删除用户------");
        return 1;
    }
}
