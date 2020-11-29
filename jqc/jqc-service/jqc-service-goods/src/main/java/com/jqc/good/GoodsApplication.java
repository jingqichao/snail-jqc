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
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author jqc
 * @Date 2020/11/28 15:06
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class GoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class, args);
    }
}
