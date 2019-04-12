方式1 : @ConfigurationProperties + @Component 注解到bean定义类上

方式2 : @ConfigurationProperties + @Bean注解在配置类的bean定义方法上

方式3 : @ConfigurationProperties注解到普通类，然后在@Configuration的注册的类上使用@EnableConfigurationProperties(类名.class)定义为bean
当@EnableConfigurationProperties注解应用到你的@Configuration时， 任何被@ConfigurationProperties注解的beans
将自动被Environment属性配置。 这种风格的配置特别适合与SpringApplication的外部YAML配置进行配合使用。