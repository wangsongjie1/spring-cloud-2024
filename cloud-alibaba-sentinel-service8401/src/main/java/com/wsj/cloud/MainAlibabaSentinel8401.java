package com.wsj.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MainAlibabaSentinel8401 {
    public static void main(String[] args) {
        SpringApplication.run(MainAlibabaSentinel8401.class,args);
    }
}