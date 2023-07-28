package com.hzaucoi.spring6.iocxml.specialValue;

public class User {
    private String name;
    private String expression;

    public User() {
    }

    public User(String name, String expression) {
        this.name = name;
        this.expression = expression;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", expression='" + expression + '\'' +
                '}';
    }
}
