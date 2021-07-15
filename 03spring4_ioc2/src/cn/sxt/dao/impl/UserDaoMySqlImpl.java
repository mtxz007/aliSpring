package cn.sxt.dao.impl;

import cn.sxt.dao.UserDao;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/12
 * Time: 9:37
 */
public class UserDaoMySqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("mysql获取用户数据");
    }
}
