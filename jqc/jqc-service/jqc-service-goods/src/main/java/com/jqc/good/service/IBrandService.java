package com.jqc.good.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.jqc.goods.domain.entity.dao.BrandDo;

import java.util.List;

/**
 * <p>
 * 品牌表 服务类
 * </p>
 *
 * @author jqc
 * @since 2020-11-28
 */
public interface IBrandService extends IService<BrandDo> {

    /**
     * 查询所有的品牌类
     * @param brandDo
     * @return  List<BrandDo>
     */
    public List<BrandDo> getBrandAll(BrandDo brandDo);
}
