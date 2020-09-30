package com.rocket.phase1.crew;

import java.util.List;

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
