package com.springboot.backend.controller;

import com.springboot.backend.bean.CAQuaryResult;
import com.springboot.backend.bean.DealInfo;
import com.springboot.backend.bean.DealNum;
import com.springboot.backend.service.service;
import com.springboot.backend.service.serviceImpl;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {

    @Autowired(required = false)
    private service userService;

    @RequestMapping("/add")
    public void addNews(DealInfo dataid){
        userService.addDeal(dataid);
    }

//返回交易量
@RequestMapping(value="/getcarbonTradingNumberChartData",method = RequestMethod.POST)
    public String getcarbonTradingNumberChartData() throws JSONException {
        JSONObject object = new JSONObject();
        serviceImpl serviceImpl = new serviceImpl();
        List<DealNum> dealNums = serviceImpl.getcarbonTradingNumberByCity();
        //["湖北","上海","北京","重庆","广东","天津","深圳","福建"]
        object.put("carbonTradingNumberPiedata",dealNums);
        return object.toString();
    }
    //返回交易额
    @RequestMapping("/getcarbonTradingeAmountChartData")
    public String getcarbonTradingeAmountChartData() throws JSONException {
        List<CAQuaryResult>  results = userService.getcarbonTradingeAmountChartData();
        JSONObject object = new JSONObject();
        Integer totalAmount=0;
        for(int i=0;i<8;i++)
        {   CAQuaryResult a = results.get(i);
            totalAmount += a.getValue();
        }
        for (int i=0;i<8;i++)
        {   CAQuaryResult a = results.get(i);
            Double rate = (double) (a.getValue() / totalAmount);
            a.setRate(rate);
        }
        object.put("carbonTradingAmountPiedata", results);
        return object.toString();


    }



    @RequestMapping("/getList")
    public List<DealInfo> getAllUser(){
        return userService.findAll();
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
