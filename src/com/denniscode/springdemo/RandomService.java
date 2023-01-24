package com.denniscode.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomService implements FortuneService{

    private String[] data = {"Random Fortune Service 1 is here",
            "Random Fortune Service 2 is here", "Random Fortune Service 3 is here"};

    private Random myRandom = new Random();
    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}
