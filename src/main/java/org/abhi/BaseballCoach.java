package org.abhi;

import org.springframework.stereotype.Component;

@Component("myBaseballCoach")
public class BaseballCoach implements Coach{

    private Fortune fortune;

//    public BaseballCoach(Fortune fortune) {
//        this.fortune = fortune;
//        System.out.println("Baseball Coach Default");
//    }


    @Override
    public String getDailyWorkout() {
        return "Batting practice 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortune();
    }
}
