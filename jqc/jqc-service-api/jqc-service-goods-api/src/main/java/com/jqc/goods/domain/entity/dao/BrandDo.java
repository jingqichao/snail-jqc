package com.jqc.goods.domain.entity.dao;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

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
public class BrandDo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * TableId：
     *  value：指定主键列的列名，如果实体属性与列名一致，可以省略不指定
     *  type：指定主键策略
     */
    /**
     * 品牌id
     */
    @TableId(value = "id", type = IdType.AUTO)
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
