package org.abhi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("myBaseballCoach",BaseballCoach.class);
        System.out.println(coach.getDailyWorkout());
    //    System.out.println(coach.getDailyFortune());
        coach = context.getBean("cricketCoach",CricketCoach.class);
        System.out.println(coach.getDailyWorkout());
    //    System.out.println(coach.getDailyFortune());
        TrackCoach trackCoach = context.getBean("myTrackCoach",TrackCoach.class);
        System.out.println(trackCoach.getEmail());
        context.close();
    }
}
