package com.liao.service;

import com.liao.domain.Acount;

import java.util.ArrayList;
import java.util.Map;


public interface AcountService {
    void addUser(Acount acount);
    ArrayList<Acount> getAll();
    void update(Map<String,Object> map);
    void transfer(Map<String,Object> map);
}
