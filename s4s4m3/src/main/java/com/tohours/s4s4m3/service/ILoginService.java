package com.tohours.s4s4m3.service;

import com.tohours.s4s4m3.beans.UserBean;

public interface ILoginService {

    public UserBean Login(String username,String password);
    
    
}