package cn.sxt.staticproxy;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/16
 * Time: 9:28
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
