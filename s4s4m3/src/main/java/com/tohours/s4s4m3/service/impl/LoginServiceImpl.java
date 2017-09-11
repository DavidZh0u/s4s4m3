package com.tohours.s4s4m3.service.impl;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tohours.s4s4m3.beans.UserBean;
import com.tohours.s4s4m3.mapper.UserMapper;
import com.tohours.s4s4m3.service.ILoginService;
@Service
public class LoginServiceImpl implements ILoginService{
    
    @Resource
    private UserMapper um;


    @Override
    public UserBean Login(String username, String password) {
        return um.login(username, password);
    }

}