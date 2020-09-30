package com.rocket.phase1.crew;

import java.util.List;

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
