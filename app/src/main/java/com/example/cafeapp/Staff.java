package com.example.cafeapp;

public class Staff {
    public String name;
    public String username;
    public String password;
    public String position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Staff(String name, String username, String password, String position) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.position = position;
    }

}
