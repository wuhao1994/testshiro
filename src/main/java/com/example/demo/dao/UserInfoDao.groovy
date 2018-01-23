package com.example.demo.dao

import com.example.demo.entity.UserInfo
import org.hibernate.sql.Insert
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by 格讯科技有限公司 on 2018/1/16.
 */
interface UserInfoDao extends JpaRepository<UserInfo,Long>{
    UserInfo findByUsername(String username);
    UserInfo addUser(UserInfo u);
}