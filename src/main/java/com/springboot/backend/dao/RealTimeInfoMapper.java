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
public interface RealTimeInfoMapper {
    /**
     * 取出所有的规划新闻(GuiHuaNews),下方法均同
     * @return
     */
    List<GuiHuaNews> findAllGHN();
    List<JinRongNews> findAllJRN();
    List<TanJiaoYi> findAllTJY();
    List<TanQiQuan> findAllTQQ();
    List<ZhengCeFaGui> findZCFG();
}
