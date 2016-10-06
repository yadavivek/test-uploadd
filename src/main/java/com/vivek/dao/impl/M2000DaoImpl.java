package com.vivek.dao.impl;

import com.vivek.dao.M2000Dao;
import com.vivek.dto.M2000;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ttnd on 3/10/16.
 */

@Repository
public class M2000DaoImpl implements M2000Dao {

    @Autowired
    SessionFactory sessionFactory;

    public List<M2000> list() {
        return sessionFactory.getCurrentSession().createCriteria(M2000.class).list();
    }
}
