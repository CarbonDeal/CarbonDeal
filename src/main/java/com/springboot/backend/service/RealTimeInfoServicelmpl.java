package com.springboot.backend.service;
import com.springboot.backend.bean.*;
import com.springboot.backend.dao.RealTimeInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年11月01日 18:59
 */
@Service()
@Repository
@ComponentScan
public class RealTimeInfoServicelmpl implements RealTimeInfoService{
    @Autowired
    public RealTimeInfoMapper mapper;

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

}
