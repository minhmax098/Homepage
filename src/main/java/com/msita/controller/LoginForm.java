package com.msita.controller;

public class LoginForm {
    private String username;
    private String password;

    void setUsername (String username){
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
