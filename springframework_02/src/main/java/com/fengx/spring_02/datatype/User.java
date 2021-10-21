package com.fengx.spring_02.datatype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author: Fengx
 * @date: 2021-10-19
 * @description: bean 类
 **/
public class User {

    /**
     * 基本数据类型
     */
    private double id;

    /**
     * 字符串类
     */
    private String name;

    /**
     * 实体类
     */
    private User wife;

    /**
     * 实体数组
     */
    private User[] friends;

    /**
     * List列表
     */
    private List<User> schoolmates;

    /**
     * Set集合
     */
    private Set<String> favorites;

    /**
     * Map集合
     */
    private Map<String, String> emails;

    public void setId(double id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWife(User wife) {
        this.wife = wife;
    }

    public void setFriends(User[] friends) {
        this.friends = friends;
    }

    public void setSchoolmates(List<User> schoolmates) {
        this.schoolmates = schoolmates;
    }

    public void setFavorites(Set<String> favorites) {
        this.favorites = favorites;
    }

    public void setEmails(Map<String, String> emails) {
        this.emails = emails;
    }

    /**
     * 重写 Object 类 toString()
     * @return
     */
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", wife=" + wife + ", friends=" + Arrays.toString(friends)
                + ", schoolmates=" + schoolmates + ", favorites=" + favorites + ", emails=" + emails + "]";
    }
}
