package com.jason.cartoon.model;

/**
 * Created by Jason on 2017/10/7.
 */

public class UserModel {
    private String name;
    private String password;
    public UserModel() {
    }
    public UserModel(String name, String password) {

        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

