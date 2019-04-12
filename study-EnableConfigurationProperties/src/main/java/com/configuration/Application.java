package com.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

// 声明为Spring boot 应用，隐含了注解@Configuration
@SpringBootApplication
@EnableConfigurationProperties(Bean3.class)
public class Application {
	// @Bean 注解在该方法上定义一个bean,这种基于方法的Bean定义不一定非要出现在
	// @SpringBootApplication 注解的类中，而是出现在任何@Configuration注解了
	// 的类中都可以
    @Bean
    // 使用配置文件中前缀为section2的属性的值初始化这里bean定义所产生的bean实例的同名属性，
    // 在使用时这个定义产生的bean时，其属性 name 会是 Jerry
    @ConfigurationProperties(prefix = "section2")
    public Bean2 bean2() {
	    // 注意，这里的 Bean2 是上面所示的一个POJO类，没有任何注解
        return new Bean2();
    }

    public static void main(String[] args) throws Exception {
        final ApplicationContext ac = SpringApplication.run(Application.class, args);
        System.out.println(ac.getBean(Bean3.class).getName());
    }
}
