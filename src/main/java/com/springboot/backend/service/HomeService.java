package com.springboot.backend.service;

import com.springboot.backend.bean.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年11月01日 18:55
 */
@MapperScan("com.springboot.backend.dao.mapper")//扫描指定包下接口)
@Service
@Repository
public interface HomeService {
}
