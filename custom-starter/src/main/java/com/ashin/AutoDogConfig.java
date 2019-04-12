package com.ashin;

import com.ashin.bean.Dog;
import com.ashin.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ashin Liang on 2018/9/7.
 */
@Configuration
@EnableConfigurationProperties(Dog.class)
@ConditionalOnClass(DogService.class)
public class AutoDogConfig {

    @Autowired
    private Dog dog;

    @Bean
    @ConditionalOnMissingBean(DogService.class)
    public DogService createDogService(){
        return new DogService(dog.getName(),dog.getColor());
    }
}
