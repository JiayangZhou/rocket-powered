package com.rocket.phase1.crew;

import com.rocket.phase1.materials.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EnglishCrew implements CrewCondition{
    @Value("BigBritish")
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
