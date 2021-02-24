package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    //define a private filed for dependency
    private FortuneService fortuneService;

    //define a constructor fro dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        //use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }

    @Override
    public String getRandomFortune() {
        return null;
    }
}
