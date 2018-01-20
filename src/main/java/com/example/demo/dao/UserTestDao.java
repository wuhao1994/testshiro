package com.example.demo.dao;

import com.example.demo.entity.UserTest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 格讯科技有限公司 on 2018/1/20.
 */
public interface UserTestDao extends JpaRepository<UserTest,Long> {
    UserTest findByUsername(String username);
}
