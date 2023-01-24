package com.denniscode.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;
//    @Autowired
//    public TennisCoach(FortuneService theFortuneService){
//        fortuneService = theFortuneService;
//    }

    //define a default constructor
    public TennisCoach(){
        System.out.println(">> inside default tennis constructor");
    }

    // define a setter method
//    @Autowired
//    public void setFortuneService(FortuneService theFortuneService){
//        System.out.println(">> inside default setFortuneService method");
//        fortuneService = theFortuneService;
//    }


    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


//    @Autowired
//    public void doSomeCrazyThings(FortuneService theFortuneService){
//        System.out.println("DONE CRAZY THING!!!!!!" + fortuneService);
//        fortuneService = theFortuneService;
//    }


}
