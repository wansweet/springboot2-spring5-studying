package com.spring.demo;

import com.spring.imselector.ImportSelectorApplication;
import com.spring.imselector.annotation.EnableSpringStudy;
import com.spring.imselector.model.StudentBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试导入外部配置，AppConfig
 */
@SpringBootApplication
@EnableSpringStudy
public class ImApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImApplication.class);
        StudentBean studentBean = applicationContext.getBean(StudentBean.class);
        System.out.println(studentBean.getName());
    }

}
