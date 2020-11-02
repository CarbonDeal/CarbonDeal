package com.springboot.backend.service;
import com.springboot.backend.bean.*;
import com.springboot.backend.dao.KanpanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年11月01日 18:58
 */
@Service()
@Repository
@ComponentScan
public class KanpanServicelmpl implements KanpanService {
    @Autowired
    public KanpanMapper mapper;
    @Override
    public List<LineChart> getLineChartData(String city){
        return mapper.getLineChartData(city);
    }

    @Override
    public List<LineChart> getLineChartDatashenzhen(String city) {
        return mapper.getLineChartDatashenzhen(city);
    }

    @Override
    public List<DealInfo> findAllDeal() {
        List<DealInfo> dealInfoList=mapper.findAllDeal();
        return dealInfoList;
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
