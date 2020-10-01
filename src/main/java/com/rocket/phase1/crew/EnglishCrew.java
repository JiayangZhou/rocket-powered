package com.rocket.phase1.crew;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EnglishCrew implements CrewCondition{
    String crewName;
    int crewSize;
    List<Person> crewList;
    public EnglishCrew(){

    }

    @Override
    public boolean isEveryoneHealthy() {
        return true;
    }
}
