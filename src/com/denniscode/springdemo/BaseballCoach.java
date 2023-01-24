package com.denniscode.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Autowired
    @Qualifier("randomService")
    private FortuneService fortuneService;

    public BaseballCoach(){
        System.out.println(">> inside default baseball constructor");
    }
    //constructor
//    @Autowired
//    public BaseballCoach(FortuneService theFortuneService){
//        fortuneService =  theFortuneService;
//    }
    @Override
    public String getDailyWorkout() {
        return "play baseball for one hour";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
