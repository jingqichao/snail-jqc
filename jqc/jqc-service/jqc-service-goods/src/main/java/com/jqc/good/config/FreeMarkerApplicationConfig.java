/*
 * Copyright (C), 2015-2021, jqc
 * FileName: FreeMarkerApplicationConfig
 * Author:   jqc
 * Date:     2021/3/16 14:39
 * Description: FreeMarkerApplicationConfig
 */
package com.jqc.good.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

/**
 * FreeMarkerApplicationConfig
 *
 * @author jingqc
 * @create 2021/3/16
 */
@Configuration
@ConditionalOnProperty(value = "spring.freemarker.template-loader-path")
public class FreeMarkerApplicationConfig {

    /**
     * freeMarker 模板配置
     */
    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer() {

        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
        freeMarkerConfigurer.setDefaultEncoding("UTF-8");
        freeMarkerConfigurer.setTemplateLoaderPath("classpath:/freemarker");
        return freeMarkerConfigurer;
    }
}
