package com.springboot.backend.dao;

import com.springboot.backend.bean.*;
import org.apache.ibatis.annotations.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Mapper
@Repository
@ComponentScan
@Service
public interface mapper {
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

    /**
     * 取出所有的规划新闻(GuiHuaNews),下方法均同
     * @return
     */
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
    void updateDeal(DealInfo dataid);
    /**
     * 注册  插入一条user记录
     * @param user
     * @return
     */

//    @Insert("insert into user(userId,username,password) values(#{userId},#{username},#{password})")
    //加入该注解可以保存对象后，查看对象插入id
    @Options(useGeneratedKeys = true,keyProperty = "userId",keyColumn = "userId")
    void regist(User user);

    /**
     * 登录
     * @param user
     * @return
     */
//    @Select("select user.userId from user u where user.username = #{username} and password = #{password}")
    Integer login(User user);

    @Select(value = "select u.username,u.password,u.activeCode from user u where u.username=#{username}")
    @Results({@Result(property = "username",column = "username"),
                    @Result(property = "password",column = "password"),
                    @Result(property = "active_code",column = "activeCode")})
    User findUserByName(@Param("username") String username);

    /**
     * 根据激活码查询用户
     * @param activeCode
     * @return
     */
    User selectUserByActiveCode(String activeCode);

    /**
     * 更新用户
     * @param user
     */
    void update(User user);







}
