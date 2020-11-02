package com.springboot.backend.dao;
import com.springboot.backend.bean.*;
import org.apache.ibatis.annotations.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年11月01日 19:07
 */
@Mapper
@Repository
@ComponentScan
@Service
public interface KanpanMapper {
    /**
     * 查询所有的交易信息
     * @return
     */
    List<DealInfo> findAllDeal();
    /**
     * 查询所有的交易总额sum(DealNum)
     * @return
     */
    List<DealNum> findDealNum();
    /**
     * 获取所有交易的交易总数sum(dealamount)
     * @return
     */
    List<CAQuaryResult> getcarbonTradingeAmountChartData();
    void addDeal(DealInfo dataid);
    void updateDeal(DealInfo dataid);
    void deleteDeal(DealInfo dataid);
    /**
     * 按城市名获取深圳的所有交易数据
     * 单独写区别其他城市
     * @param city
     * @return
     */
    @Select("select indate ,ifnull(SUM(dealamount)/SUM(dealnum),0) as deal, ifnull(SUM(dealnum),0) as dealnum from data.dealinfo where housetext=#{city} GROUP BY indate")
    List<LineChart> getLineChartDatashenzhen(@Param("city") String city);
    /**
     * 按城市名获取城市的所有交易数据
     * (indate,deal,dealnum)
     * @param city
     * @return
     */
    @Select("select indate , deal, dealnum from data.dealinfo where housetext=#{city} ")
    List<LineChart> getLineChartData(@Param("city") String city);
}
