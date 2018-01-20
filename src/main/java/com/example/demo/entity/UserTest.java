package com.example.demo.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 格讯科技有限公司 on 2018/1/20.
 */
@Entity
public class UserTest {
        @Id
        @GeneratedValue
        private Integer uid;
        @Column(unique =true)
        private String username;//帐号

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUid() {

        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
