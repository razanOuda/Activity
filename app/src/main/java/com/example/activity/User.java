package com.example.activity;

public class User {
    String id;
    String username;
    private  User(){}
    User(String id, String username) {
        this.id = id;
        this.username = username;

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

}

