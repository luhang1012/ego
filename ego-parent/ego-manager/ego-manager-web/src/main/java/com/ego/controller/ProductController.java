package com.ego.controller;

import com.ego.pojo.GoodsCategory;
import com.ego.service.GoodsCategoryServiceI;
import com.ego.service.result.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 15625 on 2020/3/11.
 * 商品管理
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private GoodsCategoryServiceI goodsCategoryService;// 商品分类service
    /**
     * 列表页
     * @return
     */
    @RequestMapping("/category/list")
    public String categoryList(){

        return "product/category/category-list";
    }
    

    /**
     * 新增商品页
     * @return
     */
    @RequestMapping("/category/add")
    public String categoryAdd(){

        return "product/category/category-add";
    }

    /**
     * 新增商品
     * @return
     */
    @RequestMapping("/category/save")
    @ResponseBody
    public BaseResult categorySave(GoodsCategory goodsCategory){

        return goodsCategoryService.insertCategory(goodsCategory);
    }
}
