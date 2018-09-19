package com.tony.unit.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by MABO on 2017/7/4.
 */
@Component
@Data
@ConfigurationProperties(prefix = "spring.redis")
public class RedisInfo {

    private String host;

    private String port;

    private String password;

    public String toString(){
        return "host = " + host + "; port = " + port+ "; password = " + password;
    }

}
