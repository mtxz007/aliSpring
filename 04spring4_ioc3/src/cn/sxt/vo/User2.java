package cn.sxt.vo;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/13
 * Time: 11:25
 */
public class User2 {
    private String name;

    public User2() {
        System.out.println("Uer2的无参构造方法");
    }

    public User2(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name = " + name);
    }
}

