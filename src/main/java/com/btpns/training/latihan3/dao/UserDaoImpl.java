package com.btpns.training.latihan3.dao;

import com.btpns.training.latihan3.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements Dao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession(){
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public UserEntity findById(int userId) {
        return (UserEntity) this.getSession().createQuery("from UserEntity where userId= :idUser").setParameter("idUser",userId).uniqueResult();
    }

    @Override
    public UserEntity findByName(String userName) {
        return (UserEntity) this.getSession().createQuery("from UserEntity where userName= :nameUser").setParameter("nameUser",userName).uniqueResult();
    }
    @Override
    public List<UserEntity> findByRoleId(int roleId) {
        return (List<UserEntity>) this.getSession().createQuery("from UserEntity where roleEntity.roleId= :roleIdFk")
                .setParameter("roleIdFk",roleId).list();
    }

    @Override
    public void insertUser(UserEntity userEntity) {
        this.getSession().save(userEntity);
    }
}
