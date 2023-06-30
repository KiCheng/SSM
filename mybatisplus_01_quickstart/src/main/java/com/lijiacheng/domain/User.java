package com.lijiacheng.domain;

import java.io.Serializable;

public class User implements Serializable {
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private String tel;

    public User() {
    }

    public User(Long id, String name, String password, Integer age, String tel) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.tel = tel;
    }

    /**
     * 获取
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String toString() {
        return "User{id = " + id + ", name = " + name + ", password = " + password + ", age = " + age + ", tel = " + tel + "}";
    }
}
