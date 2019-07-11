package com.answer.server.service;

import com.answer.server.mapper.DescMapper;
import com.answer.server.mapper.ProductMapper;
import com.answer.server.model.Desc;
import com.answer.server.model.Product;
import com.answer.server.model.ProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper pdao;

    @Autowired
    private DescMapper descdao;


    @Override
    public List<Product> queryProd() {

        ProductExample productExample=new ProductExample();

        productExample.createCriteria().andProdIdIsNotNull();

        List<Product> productList=pdao.selectByExample(productExample);

        // productList.forEach(c-> System.out.println(c.getPrice()));

        return productList;
    }


    @Override
    public void delProd(Integer prodId) {

        Product product=pdao.selectByPrimaryKey(prodId);
        Integer descId=product.getDescId();

        pdao.deleteByPrimaryKey(prodId);
        descdao.deleteByPrimaryKey(descId);

        // productList.forEach(c-> System.out.println(c.getDesc().getProdComment()));

    }

    @Override
    public List<Product> queryProdByCate(Integer cateId) {

        return pdao.selectByCateId(cateId);

    }

    @Override
    public Product queryProdById(Integer prodId) {
        Product product= pdao.selectByPrimaryKey(prodId);
        //  System.out.println(product.getDesc().getProdService());

        return product;
    }

    @Override
    public void updateProd(Integer prodId, BigDecimal price, Integer stock) {

        Product product=pdao.selectByPrimaryKey(prodId);
        product.setPrice(price);
        product.setStock(stock);

        pdao.updateByPrimaryKey(product);

    }

    @Override
    public void addProd(Product product, Desc desc) {

        descdao.insertDesc(desc);
        List<Integer> list=descdao.selectDescId();
        product.setDescId(list.get(0));

        pdao.insertProd(product);

    }


}
