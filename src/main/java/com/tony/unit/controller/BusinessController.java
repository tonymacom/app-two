package com.tony.unit.controller;

import com.tony.unit.base.ResponseData;
import com.tony.unit.pojo.RedisInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MABO on 2017/7/4.
 */
@RestController
public class BusinessController {

    @Autowired
    private RedisInfo redisInfo;

    @RequestMapping(value = "/getRedisInfo")
    public ResponseData getRedisInfo(){
        ResponseData data = new ResponseData();
        data.setData(redisInfo.toString());
        return data;
    }

}
