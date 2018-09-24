package com.imooc.firstappdemo.pojo;

import org.apache.ibatis.type.Alias;

@Alias(value = "user")
public class User {
    private Long id = null;
    private String userName = null;
    private String note = null;
    //private SexEnum sex = null;
    public User(){

    }
}
