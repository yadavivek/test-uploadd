package com.vivek.service.serviceImpl;

import com.vivek.dao.M2000Dao;
import com.vivek.dto.M2000;
import com.vivek.service.M2000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by ttnd on 3/10/16.
 */
@Service
@Transactional
public class M2000ServiceImpl implements M2000Service {

    @Autowired
    M2000Dao m2000Dao;

    @Override
    public List<M2000> list() {
        return m2000Dao.list();
    }
}
