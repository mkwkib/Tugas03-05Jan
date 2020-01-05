package com.btpns.training.latihan3.dao;

import com.btpns.training.latihan3.entity.UserEntity;

import java.util.List;

public interface Dao {
    UserEntity findById(int userId);
    UserEntity findByName(String userName);
    List<UserEntity> findByRoleId(int id);
    void insertUser(UserEntity userEntity);
}
