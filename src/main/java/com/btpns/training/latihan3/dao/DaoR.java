package com.btpns.training.latihan3.dao;

import com.btpns.training.latihan3.entity.RoleEntity;

public interface DaoR {
    RoleEntity findById(int roleId);
    RoleEntity findByName(String roleName);
    void insertRole(RoleEntity roleEntity);
}
