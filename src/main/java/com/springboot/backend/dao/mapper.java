package com.springboot.backend.dao;
import com.springboot.backend.bean.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper

public interface mapper {
    /**
     * 查询用户名是否存在，若存在，不允许注册
     * 注解@Param(value) 若value与可变参数相同，注解可省略
     * 注解@Results  列名和字段名相同，注解可省略
     * @param username
     * @return
     */
    @Select(value = "select User.UserName,User.password from User  where User.UserName=#{UserName}")
    @Results
            ({@Result(property = "UserName",column = "UserName"),
                    @Result(property = "password",column = "password")})
    User findUserByName(@Param("Username") String username);

    /**
     * 注册  插入一条user记录
     * @param user
     * @return
     */
    @Insert("insert into user values(#{UserId},#{UserName},#{password})")
    //加入该注解可以保存对象后，查看对象插入id
    @Options(useGeneratedKeys = true,keyProperty = "UserId",keyColumn = "UserId")
    void regist(User user);

    /**
     * 登录
     * @param user
     * @return
     */
    @Select("select User.id from User u where User.username = #{Username} and password = #{password}")
    Long login(User user);

    List<DealInfo> findAll();
    void addDeal(DealInfo dataid);
    void deleteDeal(DealInfo dataid);
    void updateDeal(DealInfo dataid);
    List<GuiHuaNews> findGuiHua();
    List<JinRongNews> findJinRong();
    List<TanJiaoYi> findJiaoYi();
    List<TanQiQuan> findQiQuan();
    List<ZhengCeFaGui> findZhengCe();


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
