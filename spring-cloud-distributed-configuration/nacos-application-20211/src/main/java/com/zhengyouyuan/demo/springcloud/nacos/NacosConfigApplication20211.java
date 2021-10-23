package com.zhengyouyuan.demo.springcloud.nacos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class NacosConfigApplication20211 {

    @Value("${appName}")
    private String value;

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigApplication20211.class, args);
    }

    @RequestMapping("get")
    public Object get(){
        return value;
    }
}