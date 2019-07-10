package com.answer.server.controller;


import com.answer.server.model.Category;
import com.answer.server.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController   // Restful 技术前后端分离技术
@CrossOrigin        //跨域访问支持  ，不同的端口号可以访问
@RequestMapping(name = "cate",value = "/cate")
public class CategoryController {

    @Autowired
    public CategoryServiceImpl cateService;

    //  调用server  初始化数据
    @RequestMapping(value = "/query")
    public ResponseEntity<List<Category>> queryCate(){

        return new ResponseEntity<List<Category>>(cateService.queryCate(),HttpStatus.OK);

    }

}
