package cn.sxt.service.impl;

import cn.sxt.dao.UserDao;
import cn.sxt.service.UserService;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/12
 * Time: 9:41
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = null;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
