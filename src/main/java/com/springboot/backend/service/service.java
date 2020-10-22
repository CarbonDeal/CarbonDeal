package com.springboot.backend.service;

import java.util.List;

import com.springboot.backend.bean.*;
import com.springboot.backend.dao.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@MapperScan("com.springboot.backend.dao.mapper")//扫描指定包下接口)
@Service
public interface service extends mapper{
     @Autowired
     private UserMapper userMapper;
     /**
      * 注册
      * @param user 参数封装
      * @return Result
      */
     public Result regist(User user) {
          Result result = new Result();
          result.setSuccess(false);
          result.setDetail(null);
          try {
               User existUser = userMapper.findUserByName(user.getUsername());
               if(existUser != null){
                    //如果用户名已存在
                    result.setMsg("用户名已存在");

               }else{
                    userMapper.regist(user);
                    //System.out.println(user.getId());
                    result.setMsg("注册成功");
                    result.setSuccess(true);
                    result.setDetail(user);
               }
          } catch (Exception e) {
               result.setMsg(e.getMessage());
               e.printStackTrace();
          }
          return result;
     }
     /**
      * 登录
      * @param user 用户名和密码
      * @return Result
      */
     public Result login(User user) {
          Result result = new Result();
          result.setSuccess(false);
          result.setDetail(null);
          try {
               Long userId= userMapper.login(user);
               if(userId == null){
                    result.setMsg("用户名或密码错误");
               }else{
                    result.setMsg("登录成功");
                    result.setSuccess(true);
                    user.setId(userId);
                    result.setDetail(user);
               }
          } catch (Exception e) {
               result.setMsg(e.getMessage());
               e.printStackTrace();
          }
          return result;
     }


     List<DealInfo> findAll();
     void addDeal(DealInfo dataid);
     void deleteDeal(DealInfo dataid);
     void updateDeal(DealInfo dataid);
     List<GuiHuaNews> findGuiHua();
     List<JinRongNews> findJinRong();
     List<TanJiaoYi> findJiaoYi();
     List<TanQiQuan> findQiQuan();
     List<ZhengCeFaGui> findZhengCe();


}
