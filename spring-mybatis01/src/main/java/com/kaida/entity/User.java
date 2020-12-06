package com.kaida.entity;


import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = -6733188037694723033L;
    private String userName;
    private String userRole;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userRole='" + userRole + '\'' +
                '}';
    }
}
