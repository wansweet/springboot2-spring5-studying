package com.beanScanner.config;

import com.beanScanner.DefaultClassRegistryBeanFactory;
import com.beanScanner.MapperManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassRegistryBeanScannerConfig {
 
    @Bean(name = "mapperManagerFactoryBean")
    public MapperManagerFactoryBean configMapperManagerFactoryBean() {
        MapperManagerFactoryBean mapperManagerFactoryBean = new MapperManagerFactoryBean();
        return mapperManagerFactoryBean;
    }
 
    @Bean
    public DefaultClassRegistryBeanFactory configDefaultClassRegistryBeanFactory() {
        DefaultClassRegistryBeanFactory defaultClassRegistryBeanFactory = new DefaultClassRegistryBeanFactory();
        defaultClassRegistryBeanFactory.setScanPackage("com.beanScanner.dao");
        defaultClassRegistryBeanFactory.setMapperManagerFactoryBean("mapperManagerFactoryBean");
        return defaultClassRegistryBeanFactory;
    }
}