package com.denniscode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        // read spring configure file

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from spring container

        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach BaseballCoach = context.getBean("baseballCoach", Coach.class);

        //call a method on the bean

        System.out.println(theCoach.getDailyWorkout() + ", " +theCoach.getDailyFortune());

        System.out.println(BaseballCoach.getDailyWorkout()+ ", " +BaseballCoach.getDailyFortune());

        //close the container

        context.close();
    }
}
