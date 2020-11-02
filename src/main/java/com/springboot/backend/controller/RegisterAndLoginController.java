package com.springboot.backend.controller;

import com.springboot.backend.bean.*;
import com.springboot.backend.service.RegisterAndLoginServicelmpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年11月01日 18:54
 */
@RestController
@ResponseBody
public class RegisterAndLoginController {
    @Resource
    private RegisterAndLoginServicelmpl userService;
    /**
     * 注册
     * 默认激活状态为0,生成激活码并发送邮件
     * @param user 参数封装
     * @return Result
     */
    @PostMapping(value = "/regist")
    public UserResult regist(@RequestBody User user) {
        user.setActiveStatus(0);
        String activeCode = IDUtils.getUUID();
        user.setActiveCode(activeCode);
        return userService.regist(user);
    }

    @RequestMapping(value = "/checkCode")
    public String CheckCode(String code){
        User user = userService.getUserByActiveCode(code);
        //如果用户不等于null，把用户状态修改status=1
        if (user !=null){
            user.setActiveStatus(1);
            //把code验证码清空，已经不需要了
            user.setActiveCode("");
            userService.modifyUser(user);

            return "activeSuccess";
        }
        return "login";
    }

    /**
     * 登录
     *
     * @param user 参数封装
     * @return Result
     */
    @PostMapping(value = "/login")
    public UserResult login(@RequestBody User user) {
        return userService.login(user);
    }
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
