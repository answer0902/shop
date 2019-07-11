package com.answer.server.service;

import com.answer.server.model.Desc;
import com.answer.server.model.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public interface ProductService {
    List<Product> queryProd();
    void delProd(Integer prodId);
    void updateProd(Integer prodId, BigDecimal price, Integer stock);

    List<Product> queryProdByCate(Integer cateId);

    Product queryProdById(Integer prodId);

    void addProd(Product product, Desc desc);
}
