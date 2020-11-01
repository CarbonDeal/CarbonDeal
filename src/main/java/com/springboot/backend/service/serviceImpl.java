package com.springboot.backend.service;

import com.springboot.backend.bean.*;
import com.springboot.backend.dao.mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service()
@Repository
@ComponentScan
public class serviceImpl implements service{
    public serviceImpl() {
    }
    @Autowired
    public mapper mapper;

    @Resource
    private MailService mailService;

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
            User existUser = mapper.findUserByName(user.getUsername());
            if(existUser != null){
                //如果用户名已存在
                result.setMsg("用户名已存在");
            }else{
                mapper.regist(user);
                //获取激活码
                String code = user.getActive_code();
                System.out.println("激活码:"+code);
                //邮件主题
                String subject = "Hello!"+user.getUsername()+" 来自CarbonDeal的激活邮件";
                //发送激活码到用户注册邮箱
                String context = "<a href=\"http://localhost:8080/user/checkCode?code="+code+"\">激活请点击:"+code+"</a>";
                //发送激活邮件
                mailService.sendMimeMail(user.getEmail(),subject,context);
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

    /**
     * 按照激活码获取用户
     * @param activeCode
     * @return
     */
    @Override
    public User getUserByActiveCode(String activeCode) {
        return mapper.selectUserByActiveCode(activeCode);
    }

    /**
     * 更新用户（邮件激活后，修改用户的activeStatus）
     * @param user
     */
    @Override
    public void modifyUser(User user) {
        mapper.update(user);
    }
}