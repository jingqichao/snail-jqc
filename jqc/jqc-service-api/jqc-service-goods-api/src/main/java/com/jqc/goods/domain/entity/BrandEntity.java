/**
 * Copyright (C), 2020-2020, 荆启超
 * FileName: BrandEntity
 * Author:   jqc
 * Date:     2020/12/1 23:02
 * Description: 品牌类实体属性
 */
package com.jqc.goods.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author jqc
 * @Date 2020/12/1 23:02
 * @Version 1.0
 */
@Data
public class BrandEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * TableId：
     *  value：指定主键列的列名，如果实体属性与列名一致，可以省略不指定
     *  type：指定主键策略
     *
     *  如何数据库字段是下划线（如：stu_name），转实体类驼峰式问题，默认设置为true了，自动识别
     */
    /**
     * 品牌id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 品牌名称
     * 指定数据库的字段名：@TableField(value = "name")
     */
    @TableField(value = "name")
    private String name;

    /**
     * 品牌图片地址
     */
    private String image;

    /**
     * 品牌的首字母
     * 查询时候不返回letter的值： @TableField(select = false)
     */
    @TableField(select = false)
    private String letter;

    /**
     * 排序
     */
    private Integer seq;

    /**
     * 地址
     * address在数据库不存在：@TableField(exist = false)
     */
    @TableField(exist = false)
    private String address;
}
