package com.springboot.backend.dao;
import com.springboot.backend.bean.*;
import org.apache.ibatis.annotations.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年11月01日 19:05
 */
@Mapper
@Repository
@ComponentScan
@Service
public interface FuWuMapper {
}
