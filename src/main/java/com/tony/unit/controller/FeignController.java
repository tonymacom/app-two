package com.tony.unit.controller;

import com.tony.unit.base.ResponseData;
import com.tony.unit.feign.DemoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2018/11/13
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
@RestController
public class FeignController {

    @Autowired
    DemoFeign demoFeign;


    @RequestMapping(value = "/hello")
    public ResponseData ribbonQueryAppOne(){
        ResponseData data = new ResponseData();
        data.setData(demoFeign.hello("abc"));
        return data;
    }

}
