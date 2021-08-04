package com.zhengyouyuan.demo.springcloud.nacos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class NacosClientProvider10421 {

    public static void main(String[] args) {
        SpringApplication.run(NacosClientProvider10421.class);
    }

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "provider/call")
    public String call(){
        return "spring cloud nacos provider, port=" + port;
    }

}
