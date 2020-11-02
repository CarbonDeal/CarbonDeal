package com.springboot.backend.service;
import com.springboot.backend.dao.MineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年11月01日 18:58
 */
@Service()
@Repository
@ComponentScan
public class MineServicelmpl implements MineService {
    @Autowired
    public MineMapper mapper;
}
