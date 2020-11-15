package com.jqc.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer
/**
 * @Author jqc
 * @Date 2020/11/16 2:10
 * @Version 1.0
 */
public class EurekaApplication {

    /**
     * 加载启动类,以启动类为当前springBoot的配置类标准
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
