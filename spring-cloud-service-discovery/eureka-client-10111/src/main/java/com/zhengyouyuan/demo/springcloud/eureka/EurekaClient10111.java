package com.zhengyouyuan.demo.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClient10111 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClient10111.class);
    }
}
