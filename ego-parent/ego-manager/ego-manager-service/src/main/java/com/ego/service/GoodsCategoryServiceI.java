package com.ego.service;

import com.ego.pojo.GoodsCategory;
import com.ego.service.result.BaseResult;

/**
 * 商品分类service
 */
public interface GoodsCategoryServiceI {
    /**
     * 新增商品分类
     */
    BaseResult insertCategory(GoodsCategory goodsCategory);
}
