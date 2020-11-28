package com.jqc.goods.entity;


import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 品牌表
 * </p>
 *
 * @author jqc
 * @since 2020-11-28
 */
@Data
//@EqualsAndHashCode(callSuper = false)
public class TbBrand implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     */
//    @TableId(value = "id", type = IdType.AUTO)
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


}
