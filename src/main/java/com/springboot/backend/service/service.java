package com.springboot.backend.service;

import java.util.List;
import com.springboot.backend.bean.DealInfo;
public interface service {
     List<DealInfo> findAll();
     void addDeal(DealInfo dataid);
     void deleteDeal(DealInfo dataid);
     void updateDeal(DealInfo dataid);
}
