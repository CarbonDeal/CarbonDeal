package com.springboot.backend.controller;
import  com.springboot.backend.service.service;
import com.springboot.backend.bean.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {

    @Autowired(required = false)
    private service userService;

    @RequestMapping("/add")
    public void addNews(user dataid){
        userService.addDeal(dataid);
    }

    @RequestMapping("/getList")
    public List<user> getAllUser(){
        return userService.findAll();
    }

    @RequestMapping("/update/{dataid}")
    public void updateNews(user dataid){
        userService.updateDeal(dataid);
    }

    @RequestMapping("/delete/{dataid}")
    public void deleteNews(user dataid){
         userService.deleteDeal(dataid);
    }
}
