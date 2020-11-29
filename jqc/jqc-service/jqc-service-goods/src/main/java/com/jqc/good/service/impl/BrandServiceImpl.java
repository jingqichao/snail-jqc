package com.jqc.good.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jqc.good.mapper.BrandMapper;
import com.jqc.good.service.IBrandService;
import com.jqc.goods.domain.entity.dao.BrandDo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
public class BrandServiceImpl extends ServiceImpl<BrandMapper, BrandDo> implements IBrandService {

    @Resource
    private BrandMapper brandMapper;

    @Override
    public List<BrandDo> getBrandAll(BrandDo brandDo) {
        return brandMapper.selectList(null);
    }
}
