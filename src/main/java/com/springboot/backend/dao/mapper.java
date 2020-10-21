package com.springboot.backend.dao;
import com.springboot.backend.bean.DealInfo;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface mapper {
    List<DealInfo> findAll();
    void addDeal(DealInfo dataid);
    void deleteDeal(DealInfo dataid);
    void updateDeal(DealInfo dataid);
}
