package com.springboot.backend.controller;

import com.springboot.backend.bean.*;
import com.springboot.backend.service.KanpanServicelmpl;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年11月01日 18:48
 */
@RestController
@ResponseBody
public class KanpanController {
    @Resource
    private KanpanServicelmpl userService;
    @RequestMapping("/getLineChartData")
    public String getLineChartData() throws JSONException{

        List<LineChart> listBeiJing =userService.getLineChartData("北京");
        List<LineChart> listShangHai =userService.getLineChartData("上海");
        List<LineChart> listGuangDong =userService.getLineChartData("广东");
        List<LineChart> listTianJin =userService.getLineChartData("天津");

        List<LineChart> listShenZhen =userService.getLineChartDatashenzhen("深圳");
        List<LineChart> listHuBei =userService.getLineChartData("湖北");
        List<LineChart> listChongQing =userService.getLineChartData("重庆");
        List<LineChart> listFuJian =userService.getLineChartData("福建");
        JSONObject object=new JSONObject();
        object.put("BeiJingLineChart",listBeiJing);
        object.put("ShangHaiLineChart",listShangHai);
        object.put("GuangDongLineChart",listGuangDong);
        object.put("TianJinLineChart",listTianJin);
        object.put("ShenZhenLineChart",listShenZhen);
        object.put("HuBeiLineChart",listHuBei);
        object.put("ChongQingLineChart",listChongQing);
        object.put("FuJianLineChart",listFuJian);
        return object.toString();
    }
    @RequestMapping("/getList")
    public List<DealInfo> getAllUser() {
        return userService.findAllDeal();
    }
    //返回交易量
    @RequestMapping(value = "/getcarbonTradingeNumberChartData", method = RequestMethod.POST)
    public List<DealNum> getcarbonTradingNumberChartData() throws JSONException {
        JSONObject object = new JSONObject();

        List<DealNum> dealNums = userService.getcarbonTradingNumberByCity();
        //["湖北","上海","北京","重庆","广东","天津","深圳","福建"]
        object.put("carbonTradingNumberPiedata", dealNums);
        return dealNums;
    }

    //返回交易额
    @RequestMapping("/getcarbonTradingeAmountChartData")
    public List<CAQuaryResult> getcarbonTradingeAmountChartData() throws JSONException {
        List<CAQuaryResult> results = userService.getcarbonTradingeAmountChartData();
        JSONObject object = new JSONObject();
        Integer totalAmount = 0;
        for (int i = 0; i < 8; i++) {
            CAQuaryResult a = results.get(i);
            totalAmount += a.getValue();
        }
        for (int i = 0; i < 8; i++) {
            CAQuaryResult a = results.get(i);
            Double rate = (double) (a.getValue() / totalAmount);
            a.setRate(rate);
        }
        object.put("carbonTradingAmountPiedata", results);
        return results;
    }
}
