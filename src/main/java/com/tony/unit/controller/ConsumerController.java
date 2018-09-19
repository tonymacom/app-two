package com.tony.unit.controller;

import com.tony.unit.base.ResponseData;
import com.tony.unit.constant.ServerEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by MABO on 2017/7/6.
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/ribbon/visit/appone/sysinfo")
    public ResponseData ribbonQueryAppOne(){
        ResponseData data = new ResponseData();
        String reuslt = this.restTemplate.getForEntity("http://" + ServerEnum.APPONE.name + "/getInfo",String.class,"").getBody();
        data.setData(reuslt);
        return data;
    }

}
