package com.luv2code.springdemo;

public class HockeyCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Do some shots";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

    @Override
    public String getRandomFortune() {
        return null;
    }
}
