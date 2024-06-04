package com.wsj.cloud.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    // 重试机制
    @Bean
    public Retryer myRetryer() {
        return new Retryer.Default();
        // 最大请求次数(1+2) = 3 初始间隔时间100ms  重试最大间隔时间1s
        //return new Retryer.Default(100, 1, 3);
    }

    // 日志记录级别
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
