package com.rocket.phase1.crew;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ChineseCrew implements CrewCondition{
    String crewName;
    int crewSize;
    List<Person> crewList;
    public ChineseCrew(){

    }

    @Override
    public boolean isEveryoneHealthy() {
        return true;
    }
}
