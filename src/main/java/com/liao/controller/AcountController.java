package com.liao.controller;

import com.liao.domain.Acount;
import com.liao.service.AcountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller("acountController")
@RequestMapping("/acount")
public class AcountController {
    @Autowired
    AcountService acountService;

    @RequestMapping(value = "/addUser",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String addUser(Acount acount){
        acountService.addUser(acount);
        return "保存成功";
    }

    @RequestMapping("/getAll")
    public String getAll(Map<String,Object> map){
        List<Acount> all = acountService.getAll();
        map.put("acounts",all);
        return "list";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(Map<String,Object> map, String name, @RequestParam("balance")double money){
        map.put("name",name);
        map.put("balance",money);
        acountService.update(map);
        return "更新成功";
    }

    @RequestMapping("/transfer")
    @ResponseBody
    public String transfer(Map<String,Object> map, String name, @RequestParam("balance")double money,Map<String,Object> map1, @RequestParam("name1")String name1, @RequestParam("balance1")double money1){
        update(map,name,money);
        update(map1,name1,money1);
        return "转账成功";
    }
}
