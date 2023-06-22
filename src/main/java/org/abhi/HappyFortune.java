package org.abhi;

import org.springframework.stereotype.Component;

public class HappyFortune implements Fortune{
    @Override
    public String getFortune() {
        return "Happy Fortune";
    }
}
