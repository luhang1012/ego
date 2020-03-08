package com.ego.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @see(功能介绍) : 测试项目访问
 * @version(版本号) : 1.0
 * @author(创建人) : Dylan
 * @since : JDK 1.8
 */
@Controller
public class PageController {

    /**
     * 公共页面跳转 restful 风格
     * 比如：前台传 welcome 就跳转至/WEB-INF/pages/welcome.jsp
     * 比如：前台传 login 就跳转至/WEB-INF/pages/login.jsp
     * ...
     *
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String page(@PathVariable String page) {
        System.out.println("pageController-----------------" + page);
        return page;
    }

}