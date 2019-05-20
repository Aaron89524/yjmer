package com.yjmer.user.mapper;

import com.yjmer.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User queryUserById(Long id);
}
