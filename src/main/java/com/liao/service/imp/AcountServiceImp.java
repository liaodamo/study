package com.liao.service.imp;

import com.liao.domain.Acount;
import com.liao.mapper.AcountMapper;
import com.liao.service.AcountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service("acountService")
public class AcountServiceImp implements AcountService {
    @Autowired
    private AcountMapper acountMapper;
    public void addUser(Acount acount) {
        acountMapper.addUser(acount);
    }

    public ArrayList<Acount> getAll() {
        return acountMapper.getAll();
    }

    public void update(Map<String,Object> map) {
       acountMapper.update(map);
    }

    public void transfer(Map<String,Object> map) {

    }


}
