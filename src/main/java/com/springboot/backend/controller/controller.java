package com.springboot.backend.controller;
import  com.springboot.backend.service.service;
import com.springboot.backend.bean.DealInfo;
import  com.springboot.backend.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.backend.dao.mapper;
import sun.misc.Contended;

import java.util.List;

@RestController
@Controller
public class controller {

    @Autowired
    private service userService;

    /**
     * 注册
     * @param user 参数封装
     * @return Result
     */
    @PostMapping(value = "/regist")
    public Result regist(User user){
        return userService.regist(user);
    }
    /**
     * 登录
     * @param user 参数封装
     * @return Result
     */
    @PostMapping(value = "/login")
    public Result login(User user){
        return userService.login(user);
    }

}
    @RequestMapping("/add")
    public void addNews(DealInfo dataid){
        userService.addDeal(dataid);
    }

    @RequestMapping(value = "/findAll")
    public List<DealInfo> getAllUser(){
        return  userService.findAll();
    }

    @RequestMapping("/update/{dataid}")
    public void updateNews(DealInfo dataid){
        userService.updateDeal(dataid);
    }

    @RequestMapping("/delete/{dataid}")
    public void deleteNews(DealInfo dataid){
         userService.deleteDeal(dataid);
    }
}
