package com.Lijiacheng.domain;

import java.io.Serializable;

public class Book implements Serializable {
    private String type;
    private String name;
    private double price;
    private String description;

    public Book() {
    }

    public Book(String type, String name, double price, String description) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    /**
     * 获取
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置
     * @param type
     */
    public void setType(String type) {
        this.type = type;
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
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Book{type = " + type + ", name = " + name + ", price = " + price + ", description = " + description + "}";
    }
}
