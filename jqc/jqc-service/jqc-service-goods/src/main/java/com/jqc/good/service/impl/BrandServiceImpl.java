package com.jqc.good.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jqc.good.mapper.BrandMapper;
import com.jqc.good.service.BrandService;
import com.jqc.goods.domain.entity.BrandEntity;
import com.jqc.goods.domain.vo.BrandVo;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import javax.annotation.Resource;
import java.io.IOException;
import java.rmi.ServerException;
import java.util.ArrayList;
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

    @Resource(name = "brandDetailsTemplate")
    Template brandDetailsTemplate;

    @Autowired
    public BrandServiceImpl(BrandMapper brandMapper) {
        this.brandMapper = brandMapper;
    }

    /**
     * 查询所有品牌接口
     *
     * @return List<BrandVo>
     */
    @Override
    public List<BrandVo> findAll() {
        List<BrandVo> brandVoList = new ArrayList<>();
        List<BrandEntity> brands = brandMapper.selectList(null);
        for (BrandEntity brandEntity : brands) {
            BrandVo brandVO = new BrandVo() {{
                setAddress(brandEntity.getAddress());
                setId(brandEntity.getId());
                setImage(brandEntity.getImage());
                setLetter(brandEntity.getLetter());
                setName(brandEntity.getName());
                setSeq(brandEntity.getSeq());

            }};
            brandVoList.add(brandVO);
        }
        return brandVoList;
    }

    /**
     * 查询所有品牌接口freemarker格式
     *
     * @return JSONObject
     */
    @Override
    public JSONObject findAllByFreemarker() throws ServerException {
        JSONObject jsonObject = new JSONObject();
        List<BrandVo> brandVoList = this.findAll();
        String formStr;//飒飒
        try {
            // 渲染模板
            formStr = FreeMarkerTemplateUtils.processTemplateIntoString(brandDetailsTemplate, brandVoList);
        } catch (IOException e) {
            throw new ServerException("解析表单模板出现异常", e);
        } catch (TemplateException e) {
            throw new ServerException("渲染表单模板出现异常", e);
        }
        JSONObject resultJson = JSON.parseObject(formStr);
        return jsonObject;
    }
}
