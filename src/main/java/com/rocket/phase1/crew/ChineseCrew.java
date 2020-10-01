package com.rocket.phase1.crew;

import com.rocket.phase1.materials.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ChineseCrew implements CrewCondition{
    @Value("BigAsian")
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
