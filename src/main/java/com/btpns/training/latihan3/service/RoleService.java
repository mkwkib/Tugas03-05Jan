package com.btpns.training.latihan3.service;

import com.btpns.training.latihan3.entity.RoleEntity;

public interface RoleService {
    public RoleEntity findById(int roleId);
    public RoleEntity findByName(String roleName);

    public void insertRole (RoleEntity roleEntity);
}
