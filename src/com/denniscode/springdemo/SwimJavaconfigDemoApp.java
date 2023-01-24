package com.denniscode.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaconfigDemoApp {
    public static void main(String[] args) {

        // read spring configure file

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from spring container


        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        //call a method on the bean

        System.out.println(swimCoach.getDailyFortune() + swimCoach.getEmail());
        System.out.println(swimCoach.getDailyWorkout() + swimCoach.getTeam());
        //close the container

        context.close();
    }
}
