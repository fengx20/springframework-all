package com.fengx.spring_01;

/**
 * @author: Fengx
 * @date: 2021-10-19
 * @description: 实体类
 **/
@Fengx
public class User {

    private Integer id = 1;

    private String name = "Fengx";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // json字符串
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
