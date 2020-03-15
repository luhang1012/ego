package com.ego.impl;

import com.ego.GoodsCategory;
import com.ego.GoodsCategoryMapper;
import com.ego.GoodsCategoryServiceI;
import com.ego.result.BaseResult;
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
