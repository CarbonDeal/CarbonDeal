package com.springboot.backend.dao;

import com.springboot.backend.bean.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface mapper {
    List<DealInfo> findAllDeal();
    List<DealNum> findDealNum();
    List<CAQuaryResult> getcarbonTradingeAmountChartData();

    List<GuiHuaNews> findAllGHN();
    List<JinRongNews> findAllJRN();
    List<TanJiaoYi> findAllTJY();
    List<TanQiQuan> findAllTQQ();
    List<ZhengCeFaGui> findZCFG();
    void addDeal(DealInfo dataid);
//    void addGHN(GuiHuaNews dataid);
//    void addJRN(JinRongNews dataid);
//    void addTJY(TanJiaoYiNews dataid);
//    void addTQQ(TanQiQuanNews dataid);
//    void addZCFG(ZhengCeFaGuiNews dataid);
    void deleteDeal(DealInfo dataid);
//    void deleteGHN(GuiHuaNews dataid);
//    void deleteJRN(JinRongNews dataid);
//    void deleteTJY(TanJiaoYiNews dataid);
//    void deleteTQQ(TanQiQuanNews dataid);
//    void deleteZCFG(ZhengCeFaGuiNews dataid);
    void updateDeal(DealInfo dataid);

}
