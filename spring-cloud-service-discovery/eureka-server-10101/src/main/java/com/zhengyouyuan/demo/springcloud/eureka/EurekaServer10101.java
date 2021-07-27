package com.zhengyouyuan.demo.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer10101 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer10101.class);
    }
}
