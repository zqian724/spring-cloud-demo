package com.zhengyouyuan.demo.springcloud.zookeeper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ZookeeperClientProvider10221 {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperClientProvider10221.class);
    }

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "provider/call")
    public String call(){
        return "spring cloud zookeeper provider, port=" + port;
    }

}
