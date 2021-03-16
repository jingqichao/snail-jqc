package com.jqc.good.controller;


import com.alibaba.fastjson.JSONObject;
import com.jqc.good.service.BrandService;
import com.jqc.goods.domain.entity.BrandEntity;
import com.jqc.goods.domain.vo.BrandVo;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.List;

/**
 * 品牌表 前端控制器
 * 跨域问题 @CrossOrigin
 *
 * @author jqc
 * @since 2020-11-28
 */
@RestController
@RequestMapping("/brand")
@CrossOrigin
public class BrandController {

    private final BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    /**
     * 查询所有品牌接口
     *
     * @return Result<List < BrandVO>>
     */
    @RequestMapping(value = "/findAll", method = RequestMethod.POST)
    public Result<List<BrandVo>> findAll() {
        List<BrandVo> brandVoList = brandService.findAll();
        return new Result<>(true, StatusCode.OK, "", brandVoList);
    }

    /**
     * 查询所有品牌接口freemarker格式
     *
     * @return JSONObject
     */
    @RequestMapping(value = "/findAll", method = RequestMethod.POST)
    public Result<JSONObject> findAllByFreemarker() throws ServerException {
        JSONObject jsonObject = brandService.findAllByFreemarker();
        return new Result<>(true, StatusCode.OK, "", jsonObject);
    }


}
