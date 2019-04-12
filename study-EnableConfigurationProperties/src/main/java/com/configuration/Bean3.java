package com.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

// 该注解声明如果该类被定义为一个bean，则对应的bean实例的属性值将来自配置文件中前缀为
// section3的同名属性。但是这个注解本身并不会导致该类被作为一个bean注册
@ConfigurationProperties(prefix = "section3")
public class Bean3 {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
