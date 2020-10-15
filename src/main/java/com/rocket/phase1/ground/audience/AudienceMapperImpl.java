package com.rocket.phase1.ground.audience;

import com.rocket.phase1.materials.Person;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class AudienceMapperImpl implements AudienceMapper{
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<Person> selectAudience() {
        AudienceMapper audienceMapper = sqlSessionTemplate.getMapper(AudienceMapper.class);
        return audienceMapper.selectAudience();
    }
}
