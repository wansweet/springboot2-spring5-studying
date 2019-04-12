package com.ashin.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Ashin Liang on 2018/9/7.
 */
@ConfigurationProperties(prefix = "my.dog")
public class Dog {

    private String name;

    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
