package com.zhengyouyuan.demo.springcloud.nacos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class NacosClientConsumer10411 {

    public static void main(String[] args) {
        SpringApplication.run(NacosClientConsumer10411.class);
    }

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("call")
    public String call() {
        return restTemplate.getForEntity("http://nacos-client-provider/provider/call", String.class, "").getBody();
    }
}
