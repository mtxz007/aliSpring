package cn.sxt.vo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * author: ylb
 * Date: 2021/7/14
 * Time: 10:03
 */
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbies;
    private Map<String, String> cards;
    private Set<String> games;
    private String wife;
    private Properties info;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setCards(Map<String, String> cards) {
        this.cards = cards;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public void show() {
        System.out.println("name = " + name);
        System.out.println("address = " + address.getAddress());
        System.out.print("books = ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i] + " ");
        }
        System.out.println();
        System.out.println("hobbies = " + hobbies);
        System.out.println("card = " + cards);
        System.out.println("games = " + games);
        System.out.println("wife = " + wife);
        System.out.println("info = " + info);
    }
}
