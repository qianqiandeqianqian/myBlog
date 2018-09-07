package com.example.myBlog.service;

import com.example.myBlog.dto.UserDto;
import com.example.myBlog.vo.UserVo;

import java.util.List;


public interface IUserService {

    int insertUser(UserDto userDto);

    int deleteUser(UserDto userDto);

    List<UserVo> queryUser(UserDto userDto);

    int updateUser(UserDto userDto);

}
