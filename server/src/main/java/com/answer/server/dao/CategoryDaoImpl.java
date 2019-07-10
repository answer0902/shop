package com.answer.server.dao;

import com.answer.server.mapper.CategoryMapper;
import com.answer.server.mapper.ProductMapper;
import com.answer.server.model.Category;
import com.answer.server.model.CategoryExample;
import com.answer.server.model.Product;
import com.answer.server.model.ProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Locale;

@Repository   //  标记它是DAO
public class CategoryDaoImpl implements categoryDao{

    @Autowired
    private CategoryMapper cdao;



    @Override
    public List<Category> queryCate() {

        CategoryExample example=new CategoryExample();

        example.createCriteria().andCateIdIsNotNull();

        List<Category> clist=cdao.selectByExample(example);

        return clist;
    }
}
