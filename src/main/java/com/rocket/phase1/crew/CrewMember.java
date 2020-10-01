package com.rocket.phase1.crew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

public class CrewMember {
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



}

