package com.itwjl.domain;

import java.util.List;
import java.util.Map;

/**
 * @program: day01_eeasy_01springMvc
 * @description:
 * @author: Mr.Wang
 * @create: 2019-10-07 11:48
 **/
public class Accout {
    private String username;
    private String password;
    private Double money;

    //private User user;
    private List<User> list;
    private Map<String,User> map;

    @Override
    public String toString() {
        return "Accout{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", list=" + list +
                ", map=" + map +
                '}';
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    /* public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }*/

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
