package cn.sxt.factory;

import cn.sxt.vo.User2;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/13
 * Time: 11:44
 */
public class UserFactory {
    public static User2 newInstance(String name) {
        return new User2(name);
    }
}
