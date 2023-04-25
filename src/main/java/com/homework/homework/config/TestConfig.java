package com.homework.homework.config;

import com.homework.homework.config.properties.TestProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@EnableConfigurationProperties(TestProperties.class)
@Configuration
public class TestConfig {
    @Bean(name = "uno")
    @Profile("test")
    public String uno(){
        System.out.println("uno");
        return "1";
    }

    @Bean
    @ConditionalOnBean(name = "uno")
    public String due(){
        System.out.println("due");
        return "2";
    }

    @Bean
    @ConditionalOnExpression("'${test.evn}'.equals('default')")
    public String tre() {
        System.out.println("tre");
        return "3";
    }
}
