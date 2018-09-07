package com.example.myBlog.service.impl;

import com.example.myBlog.dto.UserDto;
import com.example.myBlog.mapper.UserMapper;
import com.example.myBlog.service.IUserService;
import com.example.myBlog.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int insertUser(UserDto userDto) {
        int i=userMapper.insertUser(userDto);
        return i;
    }

    @Override
    public int deleteUser(UserDto userDto) {
        return 0;
    }

    @Override
    public List<UserVo> queryUser(UserDto userDto) {
        return null;
    }

    @Override
    public int updateUser(UserDto userDto) {
        return 0;
    }
}
