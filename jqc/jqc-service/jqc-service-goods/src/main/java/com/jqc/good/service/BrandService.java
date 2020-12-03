/**
 * Copyright (C), 2020-2020, 荆启超
 * FileName: BrandService
 * Author:   jqc
 * Date:     2020/12/1 23:08
 * Description: 品牌类接口
 */
package com.jqc.good.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jqc.goods.domain.entity.BrandEntity;

import java.util.List;

/**
 * @Author jqc
 * @Date 2020/12/1 23:08
 * @Version 1.0
 */
public interface BrandService extends IService<BrandEntity> {

    List<BrandEntity> findAll();
}
