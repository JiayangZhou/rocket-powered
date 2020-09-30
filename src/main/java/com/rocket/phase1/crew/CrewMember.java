package com.rocket.phase1.crew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

public class CrewMember {
    @Autowired
    @Qualifier(value = "chinese")
    ChineseCrew chineseCrew;
    @Autowired
    @Qualifier(value = "english")
    EnglishCrew englishCrew;

    public CrewMember(ChineseCrew chineseCrew, @Nullable EnglishCrew englishCrew) {
        this.chineseCrew = chineseCrew;
        this.englishCrew = englishCrew;
    }



}

