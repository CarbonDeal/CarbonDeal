package com.springboot.backend.service;

import com.springboot.backend.bean.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年11月01日 18:56
 */
@MapperScan("com.springboot.backend.dao.mapper")//扫描指定包下接口)
@Service
@Repository
public interface RegisterAndLoginService {
    //    用户信息
    /**
     * 注册
     * @param user
     * @return
     */
    public UserResult regist(User user);

    /**
     * 登录
     * @param user
     * @return
     */
    public UserResult login(User user);

    /**
     * 根据激活码查找用户
     * @param activeCode
     * @return
     */
    public User getUserByActiveCode(String activeCode);

    /**
     * 修改用户信息（更新）
     * @param user
     */
    public void modifyUser(User user);
}
