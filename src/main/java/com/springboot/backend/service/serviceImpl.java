package com.springboot.backend.service;

import com.springboot.backend.bean.CAQuaryResult;
import com.springboot.backend.bean.DealInfo;
import com.springboot.backend.bean.DealNum;
import com.springboot.backend.dao.mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service()
public class serviceImpl implements service{
    public serviceImpl() {

    }
    @Resource
    public mapper mapper;

    @Override
    public List<DealInfo> findAll() {
        return null;
    }

    @Override
    public void addDeal(DealInfo dataid) {

    }

    @Override
    public void deleteDeal(DealInfo dataid) {

    }

    @Override
    public void updateDeal(DealInfo dataid) {

    }
    @Override
    public List<DealNum> getcarbonTradingNumberByCity(){
        List<DealNum> dealNumList = mapper.findDealNum();
        Integer amount = 0;
        for(int i=0;i<dealNumList.size();i++){
            amount = amount + dealNumList.get(i).getValue();
        }
        for(int i=0;i<dealNumList.size();i++){
            DealNum deal = dealNumList.get(i);
            deal.setRate(Double.valueOf(deal.getValue()/amount));
        }
        return dealNumList;
    }

    @Override
    public List<CAQuaryResult> getcarbonTradingeAmountChartData() {
        return mapper.getcarbonTradingeAmountChartData();
    }

}