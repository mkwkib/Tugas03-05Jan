package com.btpns.training.latihan3.service;

import com.btpns.training.latihan3.dao.Dao;
import com.btpns.training.latihan3.dao.DaoR;
import com.btpns.training.latihan3.entity.RoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private DaoR daoR;


    @Override
    public RoleEntity findById(int roleId) {
        return daoR.findById(roleId);
    }

    @Override
    public RoleEntity findByName(String roleName) {
        return daoR.findByName(roleName);
    }

    @Override
    public void insertRole(RoleEntity roleEntity) {
        daoR.insertRole(roleEntity);

    }
}
