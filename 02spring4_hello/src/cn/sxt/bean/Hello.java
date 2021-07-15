package cn.sxt.bean;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/12
 * Time: 11:10
 */
public class Hello {
    private String name;

    public Hello() {
        System.out.println("hello 被创建");
    }

    public void setSetName(String setName) {
        this.name = setName;
    }

    public void show() {
        System.out.println("hello," + name);
    }
}
