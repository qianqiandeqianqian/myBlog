package com.example.myBlog.controller;

import com.example.myBlog.service.IUserService;
import com.example.myBlog.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("add-user")
    public int addUser(){

        return 0;
    }

    @RequestMapping("delete-user")
    public int deleteUser(){

        return 0;
    }

    @RequestMapping("query-user")
    public List<UserVo> queryUser(){
        List<UserVo> list=new ArrayList<>();
        return list;
    }

    @RequestMapping("update-user")
    public int updateUser(){

        return 0;
    }

}
