package com.liao.mapper;

import com.liao.domain.Acount;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Map;

public interface AcountMapper {
    void addUser(Acount acount);
    ArrayList<Acount> getAll();
    void update(Map<String,Object> map);
    void transfer(Map<String,Object> map);
}
