package com.mkdev.springcoredemo.config;

import com.mkdev.springcoredemo.common.Coach;
import com.mkdev.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
