package cn.sxt.dao.impl;

import cn.sxt.dao.UserDao;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/12
 * Time: 9:47
 */
public class UserDaoOracleImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("oracle获取用户数据");
    }
}
