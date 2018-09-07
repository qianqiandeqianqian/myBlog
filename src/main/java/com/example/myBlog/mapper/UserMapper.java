package com.example.myBlog.mapper;

import com.example.myBlog.dto.UserDto;
import com.example.myBlog.entity.User;
import com.example.myBlog.vo.UserVo;
import javafx.scene.control.Pagination;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserMapper {

    public int insertUser(@Param("userDto") UserDto userDto);

    public int deleteUser(@Param("userDto") UserDto userDto);

    public List<UserVo> queryUser(Pagination page, @Param("userDto") UserDto userDto);

    public int updateUser(@Param("userDto") UserDto userDto);

}
