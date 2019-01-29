package com.techprimers.kafka.springbootkafkaconsumerexample.model;

import org.apache.kafka.common.serialization.StringDeserializer;

public class User {

    private String name;
    private String dept;
    private String possition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPossition() {
        return possition;
    }

    public void setPossition(String possition) {
        this.possition = possition;
    }

    public User() {
    }

    public User(String name, String dept, String possition) {

        this.name = name;
        this.dept = dept;
        this.possition = possition;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", dept='").append(dept).append('\'');
        sb.append(" , possition='").append(possition).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
