package cn.sxt.factory;

import cn.sxt.vo.User2;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/13
 * Time: 11:53
 */
public class UserDynamicFactory {
    public User2 newInstance(String name){
        return new User2(name);
    }
}
