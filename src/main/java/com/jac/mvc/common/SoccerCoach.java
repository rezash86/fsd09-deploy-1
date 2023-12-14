package com.jac.mvc.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Qualifier("soccer")
@Lazy
public class SoccerCoach implements Coach{

    public SoccerCoach(){
        System.out.println("I am initialized " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Shoot 200 times into the net";
    }
}
