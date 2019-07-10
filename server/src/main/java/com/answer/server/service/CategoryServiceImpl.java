package com.answer.server.service;


import com.answer.server.dao.CategoryDaoImpl;
import com.answer.server.mapper.ProductMapper;
import com.answer.server.model.Category;
import com.answer.server.model.Product;
import com.answer.server.model.ProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements categoryService {

    @Autowired
    private CategoryDaoImpl categoryDao;


    @Override
    public List<Category> queryCate() {

        return  categoryDao.queryCate();

    }



}
