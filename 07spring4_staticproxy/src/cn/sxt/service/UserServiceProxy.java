package cn.sxt.service;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/16
 * Time: 10:34
 */
public class UserServiceProxy implements UserService {
    private UserService userService;

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void search() {
        log("search");
        userService.search();
    }

    public void log(String methodName) {
        System.out.println("执行" + methodName + "方法");
    }
}
