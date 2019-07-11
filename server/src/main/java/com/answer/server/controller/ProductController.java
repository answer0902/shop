package com.answer.server.controller;

import com.answer.server.model.Category;
import com.answer.server.model.Desc;
import com.answer.server.model.Product;
import com.answer.server.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController   // Restful 技术前后端分离技术
@CrossOrigin        //跨域访问支持  ，不同的端口号可以访问
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductServiceImpl productService;
    @RequestMapping(value = "/queryProd")
    public ResponseEntity<List<Product>> queryProd(){
        // System.out.println(111);
        return new ResponseEntity<List<Product>>(productService.queryProd(), HttpStatus.OK);

    }

    @RequestMapping(value = "/queryProdById/{prodId}")
    public ResponseEntity<Product> queryProdById(@PathVariable String prodId){
        return new ResponseEntity<Product>(productService.queryProdById(Integer.parseInt(prodId)),HttpStatus.OK);
    }

    @RequestMapping(value = "/queryProdByCate/{cateId}")
    public ResponseEntity<List<Product>> queryProdByCate(@PathVariable String cateId){
        return new ResponseEntity<List<Product>>(productService.queryProdByCate(Integer.parseInt(cateId)),HttpStatus.OK);
    }

    @RequestMapping(value = "/delProd/{prodId}")
    public ResponseEntity<Void> delProd(@PathVariable String prodId){

        productService.delProd(Integer.parseInt(prodId));
        return new ResponseEntity<Void>(HttpStatus.OK);

    }


    @RequestMapping(value = "/updateProd/{prodId}/{price}/{stock}",method = RequestMethod.POST)
    public ResponseEntity<Void> updateProd(@PathVariable String prodId,@PathVariable String price,@PathVariable String stock){

        productService.updateProd(Integer.parseInt(prodId),BigDecimal.valueOf(Double.parseDouble(price)),Integer.parseInt(stock));
        return new ResponseEntity<Void>(HttpStatus.OK);

    }


    @RequestMapping(value = "/addProd/{msg}")
    public ResponseEntity<Void> addProd(@PathVariable String msg){
        //  0-商品名称  1-价格  2-库存  3-类别  4-服务  5-评价  6-图片
        String[] msg2=msg.split("-");
        Product product=new Product();
        product.setName(msg2[0]);
        product.setPrice(BigDecimal.valueOf(Double.parseDouble(msg2[1])));
        product.setStock(Integer.parseInt(msg2[2]));
        product.setCateId(Integer.parseInt(msg2[3]));

        Desc desc=new Desc();
        desc.setProdComment(msg2[5]);
        desc.setProdService(msg2[4]);
        desc.setImgSrc(msg2[6]);

        productService.addProd(product,desc);
        return new ResponseEntity<Void>(HttpStatus.OK);

    }

}
