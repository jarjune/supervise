package com.jarjune.supervise.dao;

import com.jarjune.supervise.entity.UserEntity;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IndexDao {

    @Select("select * from users")
    @Results({
            @Result(property = "username", column = "u_name"),
            @Result(property = "password", column = "u_pass")
    })
    List<UserEntity> getUser();
}
