package me.maweiyi.spear.mapper;

import me.maweiyi.spear.domain.User;
import org.apache.ibatis.annotations.Param;

public interface AuthMapper {
    public User checkLogin(@Param(value = "username") String username, @Param(value = "passwords") String passwords);
}
