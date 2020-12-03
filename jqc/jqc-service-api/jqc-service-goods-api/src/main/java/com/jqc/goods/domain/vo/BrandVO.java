/**
 * Copyright (C), 2020-2020, 荆启超
 * FileName: BrandEntity
 * Author:   jqc
 * Date:     2020/12/1 23:02
 * Description: 品牌类实体属性
 */
package com.jqc.goods.domain.vo;

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
public class BrandVO {

    /**
     * 品牌id
     */
    private Integer id;

    /**
     * 品牌名称
     */
    private String name;

    /**
     * 品牌图片地址
     */
    private String image;

    /**
     * 品牌的首字母
     */
    private String letter;

    /**
     * 排序
     */
    private Integer seq;

    /**
     * 地址
     */
    private String address;
}
