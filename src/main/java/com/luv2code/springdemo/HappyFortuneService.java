package com.luv2code.springdemo;

import java.util.HashMap;
import java.util.Random;

public class HappyFortuneService implements FortuneService {
    HashMap<Integer, String> fortunes = new HashMap();

    @Override
    public String getFortune() {
        fortunes.put(0, "Today is your lucky day!");
        fortunes.put(1, "You a winner man!!!");
        fortunes.put(2, "Let's do it!!!");
        return fortunes.get(new Random().nextInt(fortunes.size()));
    }
}
