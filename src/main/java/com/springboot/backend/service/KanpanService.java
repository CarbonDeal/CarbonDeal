package com.springboot.backend.service;

import com.springboot.backend.bean.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年11月01日 18:55
 */
@MapperScan("com.springboot.backend.dao.mapper")//扫描指定包下接口)
@Service
@Repository
public interface KanpanService {
    //     交易信息
    /**
     * 查找所有交易
     * @return
     */
    List<DealInfo> findAllDeal();
    /**
     * 按城市名获得交易信息
     * @param city
     * @return
     */
    List<LineChart> getLineChartData(String city);

    /**
     * 获得深圳的交易信息
     * @param city
     * @return
     */
    List<LineChart> getLineChartDatashenzhen(String city);
    void addDeal(DealInfo dataid);
    void deleteDeal(DealInfo dataid);
    void updateDeal(DealInfo dataid);
    /**
     * 获取碳交易的交易总额
     * @return
     */
    List<DealNum> getcarbonTradingNumberByCity();

    /**
     * 获取碳交易的交易量
     * @return
     */
    List<CAQuaryResult> getcarbonTradingeAmountChartData();
}
