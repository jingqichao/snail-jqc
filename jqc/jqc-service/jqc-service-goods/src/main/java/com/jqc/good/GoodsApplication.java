/**
 * Copyright (C), 2020-2020, 荆启超
 * FileName: GoodsApplication
 * Author:   jqc
 * Date:     2020/11/28 15:06
 * Description: 商品启动类
 */
package com.jqc.good;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author jqc
 * @Date 2020/11/28 15:06
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class GoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class);
    }
}
