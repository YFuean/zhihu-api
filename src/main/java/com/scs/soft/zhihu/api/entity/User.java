package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @ClassName User
 * @Description 用户类
 * @Author yue_fan
 * @Date 2020/1/19
 **/
@Data
@Builder
public class User {
    private String userId;
    private String mobile;
    private String email;
    private String password;
    private String name;
    private String urlToken;
    private String avatarUrl;
    private String url;
    private String headline;
    private String description;
    private Integer gender;
    private String location;
    private String business;
    private String employment;
    private String education;
    private String userCover;
    private Timestamp created;
}
