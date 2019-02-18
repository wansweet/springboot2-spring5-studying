package com.beanScanner;

import com.beanScanner.dao.UserMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created on 2019-02-18
 *
 * @author dongwan
 */
public class Application {

    public static void main(String[] args) {
        /**
         * AnnotationConfigApplicationContext可以实现基于Java的配置类加载Spring的应用上下文。
         * 避免使用application.xml进行配置
         */
        AnnotationConfigApplicationContext acApplicationCOntext = new AnnotationConfigApplicationContext("com.beanScanner");
        UserMapper userMapper = acApplicationCOntext.getBean(UserMapper.class);
        System.out.println(userMapper.getClass());
        userMapper.add("lalaldsf");
        acApplicationCOntext.stop();
    }

}