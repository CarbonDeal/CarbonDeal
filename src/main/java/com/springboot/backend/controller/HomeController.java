package com.springboot.backend.controller;

import com.springboot.backend.service.HomeServicelmpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年11月01日 18:48
 */
@RestController
@ResponseBody
public class HomeController {
    @Resource
    private HomeServicelmpl userService;
}
