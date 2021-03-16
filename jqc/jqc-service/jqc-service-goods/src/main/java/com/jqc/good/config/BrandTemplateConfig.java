/*
 * Copyright (C), 2015-2021, jqc
 * FileName: BrandTemplateConfig
 * Author:   jqc
 * Date:     2021/3/16 16:29
 * Description: 品牌类模板展示
 */
package com.jqc.good.config;

import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.IOException;

/**
 * 品牌类模板展示
 *
 * @author jingqc
 * @create 2021/3/16
 */
@Configuration
public class BrandTemplateConfig {

    @Value("${spring.freemarker.template-loader-path:}")
    private String templateLoaderPath;

    /**
     * 设置模板路径配置
     *
     * @param configuration freemarker 模板配置类
     */
    private void setConfiguration(freemarker.template.Configuration configuration) throws IOException {

        if (StringUtils.isEmpty(templateLoaderPath)) {
            configuration.setClassForTemplateLoading(FreeMarkerApplicationConfig.class, "/freemarker/brand/details/");
        } else {
            configuration.setDirectoryForTemplateLoading(new File(templateLoaderPath + "/brand/details/"));
        }
    }

    /**
     * 品牌详情模板
     *
     * @param configuration freemarker 模板配置类
     * @return 品牌详情模板
     */
    @Bean
    public Template brandDetailsTemplate(freemarker.template.Configuration configuration) throws IOException {

        this.setConfiguration(configuration);
        return configuration.getTemplate("index.ftl");
    }

}
