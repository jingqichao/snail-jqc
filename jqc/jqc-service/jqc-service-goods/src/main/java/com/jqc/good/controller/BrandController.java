package com.jqc.good.controller;


import com.jqc.good.service.IBrandService;
import com.jqc.good.service.impl.BrandServiceImpl;
import com.jqc.goods.domain.entity.dao.BrandDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 品牌表 前端控制器
 * </p>
 *
 * @author jqc
 * @since 2020-11-28
 */
@RestController
@RequestMapping("/brand")
//跨域问题
@CrossOrigin
public class BrandController {

    @Autowired
    private IBrandService iBrandService;

    @RequestMapping(value = "/findBrandAll")
    public void findBrandAll(BrandDo brandDo){
        brandDo.setId(2);
        brandDo.setImage("1");
        brandDo.setLetter("2");
        brandDo.setName("4");
        List<BrandDo> brandDoList = iBrandService.getBrandAll(brandDo);
        System.out.println(brandDoList);
    }
}
