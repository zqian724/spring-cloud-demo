package com.zhengyouyuan.demo.springcloud.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ConfigServerApplication20111 {

    @Value("${appName}")
    private String value;

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication20111.class, args);
    }

    @RequestMapping("get")
    public Object get(){
        return value;
    }
}
