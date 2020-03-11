package com.ego.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 15625 on 2020/3/11.
 * 商品管理
 */
@Controller
@RequestMapping("/product")
public class ProductController {
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
}
