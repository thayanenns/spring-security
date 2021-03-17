package com.exemplo.securityexemplo2.entity;

public class UserProfile {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public UserProfile(String username, String name) {
        this.username = username;
        this.name = name;
    }
}
