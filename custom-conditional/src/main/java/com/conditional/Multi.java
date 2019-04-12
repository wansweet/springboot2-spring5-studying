package com.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wuweifeng on 2017/10/11.
 */
@Configuration
@ConditionalOnProperty(
        value = {"abc.property"},
        matchIfMissing = false
)
@ConditionalOnClass(Abc.class)
public class Multi {
    @Bean
    @ConditionalOnMissingBean({Abc.class})
    public String check() {
        System.err.println("multi check");
        return "check";
    }
}