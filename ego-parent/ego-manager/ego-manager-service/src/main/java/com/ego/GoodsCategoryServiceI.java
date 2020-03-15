package com.ego;

import com.ego.result.BaseResult;
import org.springframework.stereotype.Service;

/**
 * 商品分类service
 */
@Service
public interface GoodsCategoryServiceI {
    /**
     * 新增商品分类
     */
    BaseResult insertCategory(GoodsCategory goodsCategory);
}
