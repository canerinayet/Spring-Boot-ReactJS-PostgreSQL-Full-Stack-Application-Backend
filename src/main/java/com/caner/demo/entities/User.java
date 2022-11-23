package com.caner.demo.entities;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Entity
@Table(name="users")

public class User {

    @Id
    @GeneratedValue
    Long id;
    String userName;
    String password;


    public Long getId() {
        return this.id;
    }

    public String getUserName() {
    return this.userName;}


    public String getPassword() {
        return this.password;
    }

    public void setUserName(String userName) {
        this.userName=userName;
    }

    public void setPassword(String password) {
        this.password=password;
    }
}

