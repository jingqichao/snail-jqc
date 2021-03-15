package com.jqc.good.controller;


import com.jqc.good.service.BrandService;
import com.jqc.goods.domain.entity.BrandEntity;
import com.jqc.goods.domain.vo.BrandVO;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    private final  BrandService brandService;

    @Autowired
    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public Result<List<BrandVO>>findAll(){
        List<BrandVO> brandVOList = new ArrayList<>();

        List<BrandEntity> brands = brandService.findAll();
        for (BrandEntity brandEntity : brands){
            BrandVO brandVO = new BrandVO(){{
                setAddress(brandEntity.getAddress());
                setId(brandEntity.getId());
                setImage(brandEntity.getImage());
                setLetter(brandEntity.getLetter());
                setName(brandEntity.getName());
                setSeq(brandEntity.getSeq());

            }};
            brandVOList.add(brandVO);
        }
        return new Result<>(true, StatusCode.OK,"",brandVOList);
    }

}
