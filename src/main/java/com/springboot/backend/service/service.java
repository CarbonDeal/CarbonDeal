package com.springboot.backend.service;

import com.springboot.backend.bean.CAQuaryResult;
import com.springboot.backend.bean.DealInfo;
import com.springboot.backend.bean.DealNum;

import java.util.List;
public interface service {
     List<DealInfo> findAll();
     void addDeal(DealInfo dataid);
     void deleteDeal(DealInfo dataid);
     void updateDeal(DealInfo dataid);
     List<DealNum> getcarbonTradingNumberByCity();
     List<CAQuaryResult> getcarbonTradingeAmountChartData();
}
