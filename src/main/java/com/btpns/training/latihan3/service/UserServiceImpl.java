package com.btpns.training.latihan3.service;

import com.btpns.training.latihan3.dao.Dao;
import com.btpns.training.latihan3.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private Dao dao;

    @Override
    public UserEntity findById(int userId) {
        return dao.findById(userId);
    }

    @Override
    public UserEntity findByName(String userName) {
        return dao.findByName(userName);
    }

    @Override
    public List<UserEntity> findByRoleId(int roleId) {
        return dao.findByRoleId(roleId);
    }

    @Override
    public void insertUser(UserEntity userEntity) {
        dao.insertUser(userEntity);
    }
}
