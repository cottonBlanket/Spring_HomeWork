package com.homework.homework.config;

import com.homework.homework.beans.Food.Food;
import com.homework.homework.beans.Food.Salt;
import com.homework.homework.beans.Food.Sugar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class FoodConfig {

    @Bean
    @Scope("prototype")
    public Food sugar() {
        return new Sugar();
    }

    @Bean
    @Scope("prototype")
    public Food salt() {
        return new Salt();
    }
}
