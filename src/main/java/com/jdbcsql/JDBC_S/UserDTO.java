package com.jdbcsql.JDBC_S;

import lombok.Getter;

public class UserDTO {
    private String name;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Getter
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
