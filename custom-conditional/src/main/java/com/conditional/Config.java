package com.conditional;
 
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
 
/**
 * Created by wuweifeng on 2017/10/11.
 */
@Configuration
public class Config {
 
    @Conditional(MyCondition.class)
    @Bean
    public String condition() {
        System.err.println("自定义的condition的match方法返回值为true时，才会进入该方法创建bean");
        return "";
    }
 
    /**
     * 该Abc class位于类路径上时
     */
    @ConditionalOnClass(Abc.class)
    @Bean
    public String abc() {
        System.err.println("ConditionalOnClass true");
        return "";
    }
 
//    @ConditionalOnClass(Abc.class)
//    @Bean
//    public Abc newAbc() {
//        System.err.println("ConditionalOnClass true");
//        return new Abc();
//    }
 
    /**
     * 存在Abc类的实例时
     */
    @ConditionalOnBean(Abc.class)
    @Bean
    public String bean() {
        System.err.println("ConditionalOnBean is exist");
        return "";
    }

    /**
     * 仅仅在当前上下文中不存在某个对象时，才会实例化这个Bean
     * @return
     */
    @ConditionalOnMissingBean(Abc.class)
    @Bean
    public String missBean() {
        System.err.println("ConditionalOnBean is missing");
        return "";
    }
 
    /**
     * 表达式为true时
     */
    @ConditionalOnExpression(value = "true")
    @Bean
    public String expresssion() {
        System.err.println("expresssion is true");
        return "";
    }
 
    /**
     * 配置文件属性是否为true
     */
    @ConditionalOnProperty(
            value = {"abc.property"},
            matchIfMissing = false)
    @Bean
    public String property() {
        System.err.println("property is true");
        return "";
    }
}