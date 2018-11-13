package com.tony.unit.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author www.yamibuy.com
 * @desc :
 * @date 2018/11/13
 * <b>版权所有：</b>版权所有(C) 2018，www.yamibuy.com<br>
 */
@FeignClient(name = "one", url = "http://localhost:8080")
public interface DemoFeign {

    @RequestMapping(value = "/output/{str}" , method = RequestMethod.GET)
    String hello(@PathVariable(value = "str") String str);

}
