package com.springboot.backend.service;

import com.springboot.backend.bean.*;
import com.springboot.backend.dao.mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
@Repository
public class serviceImpl implements service{
    public serviceImpl() {
    }
    @Autowired
    public mapper mapper;
    public List<LineChart> getLineChartData(String city){
        return mapper.getLineChartData(city);
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

    @Override
    public List<GuiHuaNews> findAllGHN() {
        return null;
    }

    @Override
    public List<JinRongNews> findAllJRN() {
        return null;
    }

    @Override
    public List<TanJiaoYi> findAllTJY() {
        return null;
    }

    @Override
    public List<TanQiQuan> findAllTQQ() {
        return null;
    }

    @Override
    public List<ZhengCeFaGui> findZCFG() {
        return null;
    }

    /**
     * 注册
     * @param user 参数封装
     * @return Result
     */
    public UserResult regist(User user) {
        UserResult result = new UserResult();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            User existUser = mapper.findUserByName(user.getUserName());
            if(existUser != null){
                //如果用户名已存在
                result.setMsg("用户名已存在");

            }else{
                mapper.regist(user);
                //System.out.println(user.getId());
                result.setMsg("注册成功");
                result.setSuccess(true);
                result.setDetail(user);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
    /**
     * 登录
     * @param user 用户名和密码
     * @return Result
     */
    public UserResult login(User user) {
        UserResult result = new UserResult();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            Integer userId= mapper.login(user);
            if(userId == null){
                result.setMsg("用户名或密码错误");
            }else{
                result.setMsg("登录成功");
                result.setSuccess(true);
                user.setUserId(Long.valueOf(userId));
                result.setDetail(user);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }


}