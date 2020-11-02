package com.springboot.backend.controller;

import com.springboot.backend.service.FuWuServicelmpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年11月01日 18:53
 */
@RestController
@ResponseBody
public class FuwuController {
    @Resource
    private FuWuServicelmpl userService;
}
