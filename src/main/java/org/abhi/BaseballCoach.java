package org.abhi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myBaseballCoach")
public class BaseballCoach implements Coach{

    private HappyFortune fortune;

    @Autowired
    public BaseballCoach(HappyFortune fortune) { //Constructor Injection
        this.fortune = fortune;
        System.out.println("Baseball Coach Default");
    }


    @Override
    public String getDailyWorkout() {
        return "Batting practice 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortune();
    }
}
