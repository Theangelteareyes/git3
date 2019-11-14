package com.itwjl.domain;

import java.util.Date;

/**
 * @program: day01_eeasy_01springMvc
 * @description:
 * @author: Mr.Wang
 * @create: 2019-10-07 11:56
 **/
public class User {
    private String uname;
    private String age;

    private Date date;

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age='" + age + '\'' +
                ", date=" + date +
                '}';
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
