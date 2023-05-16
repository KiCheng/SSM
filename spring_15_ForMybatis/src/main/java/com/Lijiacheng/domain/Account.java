package com.Lijiacheng.domain;

public class Account {
    private Integer id;
    private String name;
    private double money;

    public Account() {
    }

    public Account(Integer id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
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
     * @return money
     */
    public double getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }

    public String toString() {
        return "Account{id = " + id + ", name = " + name + ", money = " + money + "}";
    }
}
