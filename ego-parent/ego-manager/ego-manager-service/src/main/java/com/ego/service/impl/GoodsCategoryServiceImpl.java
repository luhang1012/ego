package com.ego.service.impl;

import com.ego.pojo.GoodsCategory;
import com.ego.mapper.GoodsCategoryMapper;
import com.ego.service.GoodsCategoryServiceI;
import com.ego.service.result.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品分类service
 */
@Service
public class GoodsCategoryServiceImpl implements GoodsCategoryServiceI {
    @Autowired
    private GoodsCategoryMapper goodsCategoryMapper;

    /**
     * 新增商品
     * @param goodsCategory
     * @return
     */
    @Override
    public BaseResult insertCategory(GoodsCategory goodsCategory) {
        int result = goodsCategoryMapper.insertSelective(goodsCategory);

        return result>0 ? BaseResult.success() : BaseResult.error();
    }
}
