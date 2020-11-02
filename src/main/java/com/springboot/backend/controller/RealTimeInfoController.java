package com.springboot.backend.controller;

import com.springboot.backend.service.RealTimeInfoServicelmpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年11月01日 18:52
 */
@RestController
@ResponseBody
public class RealTimeInfoController {
    @Resource
    private RealTimeInfoServicelmpl userService;
}
