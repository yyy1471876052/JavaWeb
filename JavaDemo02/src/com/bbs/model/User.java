package com.bbs.model;

/**
 * Created by Administrator on 2016/3/10.
 */
public class User {
    private int id;
    private String gender;
    private String name;

    public User() {
    }

    public User(int id, String gender, String name) {
        this.id = id;
        this.gender = gender;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }
}
