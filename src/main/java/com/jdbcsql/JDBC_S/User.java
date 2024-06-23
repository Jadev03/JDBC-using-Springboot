package com.jdbcsql.JDBC_S;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name="dummy")
public class User {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String Email;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
