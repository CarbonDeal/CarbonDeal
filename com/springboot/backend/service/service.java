package com.springboot.backend.service;

import com.springboot.backend.bean.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@MapperScan("com.springboot.backend.dao.mapper")//扫描指定包下接口)
@Service
@Repository
public interface service {
     List<DealInfo> findAllDeal();
     List<LineChart> getLineChartData(String city);
     void addDeal(DealInfo dataid);
     void deleteDeal(DealInfo dataid);
     void updateDeal(DealInfo dataid);
     public UserResult regist(User user);
     public UserResult login(User user);
     List<DealNum> getcarbonTradingNumberByCity();
     List<CAQuaryResult> getcarbonTradingeAmountChartData();
     List<GuiHuaNews> findAllGHN();
     List<JinRongNews> findAllJRN();
     List<TanJiaoYi> findAllTJY();
     List<TanQiQuan> findAllTQQ();
     List<ZhengCeFaGui> findZCFG();

}
