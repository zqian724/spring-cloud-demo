package com.zhengyouyuan.demo.springcloud.eureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class EurekaClientProvider10121 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProvider10121.class);
    }

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "provider/call")
    public String call(){
        return "spring cloud eureka provider, port=" + port;
    }
}
