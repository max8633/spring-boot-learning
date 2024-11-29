package com.mkdev.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Throwing 300 balls";
    }
}
