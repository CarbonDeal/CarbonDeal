package com.springboot.backend.dao;
import com.springboot.backend.bean.user;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface mapper {
    List<user> findAll();
    void addDeal(user dataid);
    void deleteDeal(user dataid);
    void updateDeal(user dataid);
}
