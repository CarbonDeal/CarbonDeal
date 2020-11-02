package com.springboot.backend.service;
import com.springboot.backend.dao.FuWuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年11月01日 18:57
 */
@Service()
@Repository
@ComponentScan
public class FuWuServicelmpl implements FuWuService {
    @Autowired
    public FuWuMapper mapper;
}
