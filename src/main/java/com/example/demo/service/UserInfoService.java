package com.example.demo.service;

import com.example.demo.entity.UserInfo;
/**
 * Created by 格讯科技有限公司 on 2018/1/16.
 */
public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
    public UserInfo addUserInfo(UserInfo userInfo);
}
