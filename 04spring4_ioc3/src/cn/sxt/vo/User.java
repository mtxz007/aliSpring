package cn.sxt.vo;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/13
 * Time: 10:54
 */
public class User {
    private String name;

    public User() {
        System.out.println("Uer的无参构造方法");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name = " + name);
    }
}
