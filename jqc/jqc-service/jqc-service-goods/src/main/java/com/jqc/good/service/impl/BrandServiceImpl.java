package com.jqc.good.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jqc.good.mapper.BrandMapper;
import com.jqc.good.service.BrandService;
import com.jqc.goods.domain.entity.BrandEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author jqc
 * @since 2020-11-28
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, BrandEntity> implements BrandService {

    private final BrandMapper brandMapper;

    @Autowired
    public BrandServiceImpl(BrandMapper brandMapper) {
        this.brandMapper = brandMapper;
    }

    /**
     * 查询所有品牌接口（无参）
     *
     * @return 品牌集合列表
     */
    @Override
    public List<BrandEntity> findAll() {
        return brandMapper.selectList(null);
    }
}
