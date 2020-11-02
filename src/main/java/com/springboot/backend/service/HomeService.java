package com.springboot.backend.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年11月01日 18:55
 */
@MapperScan("com.springboot.backend.dao.HomeMapper")//扫描指定包下接口)
@Service
@Repository
public interface HomeService {
}
