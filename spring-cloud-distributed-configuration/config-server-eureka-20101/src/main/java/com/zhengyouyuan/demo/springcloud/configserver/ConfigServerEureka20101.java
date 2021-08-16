package com.zhengyouyuan.demo.springcloud.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigServerEureka20101 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerEureka20101.class, args);
    }
}
