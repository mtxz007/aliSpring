package cn.sxt.service;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/16
 * Time: 10:26
 */
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("增加用户");
    }

    @Override
    public void update() {
        System.out.println("修改用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void search() {
        System.out.println("查询用户");
    }
}
