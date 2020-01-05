package com.btpns.training.latihan3.dao;


import com.btpns.training.latihan3.entity.RoleEntity;
import com.btpns.training.latihan3.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class DaoRImpl implements DaoR {
    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession(){
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public RoleEntity findById(int roleId) {
        return (RoleEntity) this.getSession().createQuery("from RoleEntity where roleId= :idRole").setParameter("idRole",roleId).uniqueResult();
    }

    @Override
    public RoleEntity findByName(String roleName) {
        return (RoleEntity) this.getSession().createQuery("from RoleEntity where roleName= :nameRole").setParameter("nameRole",roleName).uniqueResult();
    }

    @Override
    public void insertRole(RoleEntity roleEntity) {
        this.getSession().save(roleEntity);

    }
}
