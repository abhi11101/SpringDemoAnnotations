package org.abhi;

import org.springframework.stereotype.Component;

@Component("myTrackCoach")
public class TrackCoach implements Coach{

    private String email;
    public TrackCoach() {
        System.out.println("Track Coach Default");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("Track Setter");
        this.email = email;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5k";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
