package com.spring.imselector;

import com.spring.imselector.annotation.EnableSpringStudy;
import com.spring.imselector.model.StudentBean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@EnableSpringStudy
public class ImportSelectorApplication {

    public static void main(String[] args) {
//		SpringApplication.run(ImportSelectorApplication.class, args);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ImportSelectorApplication.class);
        StudentBean studentBean = applicationContext.getBean(StudentBean.class);
        System.out.println(studentBean.getName());

    }

}
