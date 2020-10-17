package com.rocket.phase1.ground.audience;

import com.rocket.phase1.materials.Person;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AudienceMapper {
//    @Select("SELECT * FROM person WHERE id = #{1}")
//    Person getUser(@Param("userId") String userId);
    public List<Person> selectAudience();
}
