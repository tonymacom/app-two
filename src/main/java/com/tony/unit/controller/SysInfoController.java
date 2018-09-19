package com.tony.unit.controller;

import com.tony.unit.base.ResponseData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MABO on 2017/7/4.
 */
@RestController
public class SysInfoController {

    @RequestMapping(value = "/getInfo")
    public ResponseData getSysInfo(){
        ResponseData data = new ResponseData();
        data.setData("this is app-two-cluster-1");
        return data;
    }

}
