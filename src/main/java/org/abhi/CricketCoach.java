package org.abhi;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    private Fortune fortune;

    public CricketCoach() {
        System.out.println("Cricket Default constructor");
    }

    public void setFortune(Fortune fortune) {
        this.fortune = fortune;
        System.out.println("Cricket Setter");
    }

    @Override
    public String getDailyWorkout() {
        return "50 over match practice..";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortune();
    }
}
