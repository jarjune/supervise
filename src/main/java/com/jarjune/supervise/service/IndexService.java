package com.jarjune.supervise.service;

import com.jarjune.supervise.dao.IndexDao;
import com.jarjune.supervise.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexService {

    @Autowired
    private IndexDao indexDao;

    public List<UserEntity> getUser() {
        return indexDao.getUser();
    }

}
