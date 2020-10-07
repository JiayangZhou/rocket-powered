package com.rocket.phase1.crew;

import com.rocket.phase1.ground.service.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

public class CrewMember implements Request {
    @Autowired
    @Qualifier(value = "chinese")
    // @Autowired is achieved by looking up name, alternatively, we can use @Resource
    ChineseCrew chineseCrew;
    @Autowired
    @Qualifier(value = "english")
    EnglishCrew englishCrew;

    public CrewMember() {
    }


    public CrewMember(ChineseCrew chineseCrew, @Nullable EnglishCrew englishCrew) {
        this.chineseCrew = chineseCrew;
        this.englishCrew = englishCrew;
    }


    @Override
    public void requestContent() {
        System.out.println("Crew: We got a strange signal..!");
    }
}

