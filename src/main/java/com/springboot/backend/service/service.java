package com.springboot.backend.service;

import java.util.List;
import com.springboot.backend.bean.user;
public interface service {
     List<user> findAll();
     void addDeal(user dataid);
     void deleteDeal(user dataid);
     void updateDeal(user dataid);
}
