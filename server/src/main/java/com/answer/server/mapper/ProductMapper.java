package com.answer.server.mapper;

import com.answer.server.model.Product;
import com.answer.server.model.ProductExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface ProductMapper {
    @SelectProvider(type=ProductSqlProvider.class, method="countByExample")
    int countByExample(ProductExample example);

    @DeleteProvider(type=ProductSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProductExample example);

    @Delete({
        "delete from shop_product",
        "where prod_id = #{prodId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer prodId);

    @Insert({
        "insert into shop_product (prod_id, name, ",
        "price, stock, desc_id, ",
        "cate_id)",
        "values (#{prodId,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{price,jdbcType=DECIMAL}, #{stock,jdbcType=INTEGER}, #{descId,jdbcType=INTEGER}, ",
        "#{cateId,jdbcType=INTEGER})"
    })
    int insert(Product record);

    @Insert({
            "insert into shop_product ( name, ",
            "price, stock, desc_id, ",
            "cate_id)",
            "values (#{name,jdbcType=VARCHAR}, ",
            "#{price,jdbcType=DECIMAL}, #{stock,jdbcType=INTEGER}, #{descId,jdbcType=INTEGER}, ",
            "#{cateId,jdbcType=INTEGER})"
    })
    int insertProd(Product record);

    @InsertProvider(type=ProductSqlProvider.class, method="insertSelective")
    int insertSelective(Product record);

    @SelectProvider(type=ProductSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="prod_id", property="prodId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="stock", property="stock", jdbcType=JdbcType.INTEGER),
        @Result(column="desc_id", property="descId", jdbcType=JdbcType.INTEGER),
        @Result(column="cate_id", property="cateId", jdbcType=JdbcType.INTEGER),
            @Result(property = "desc",column = "desc_id",
                    one = @One(select = "com.answer.server.mapper.DescMapper.selectByPrimaryKey"))
    })
    List<Product> selectByExample(ProductExample example);


    @Select({
        "select",
        "prod_id, name, price, stock, desc_id, cate_id",
        "from shop_product",
        "where prod_id = #{prodId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="prod_id", property="prodId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="stock", property="stock", jdbcType=JdbcType.INTEGER),
        @Result(column="desc_id", property="descId", jdbcType=JdbcType.INTEGER),
        @Result(column="cate_id", property="cateId", jdbcType=JdbcType.INTEGER),
            @Result(property = "desc",column = "desc_id",
            one = @One(select = "com.answer.server.mapper.DescMapper.selectByPrimaryKey"))
    })
    Product selectByPrimaryKey(Integer prodId);

    @Select({
            "select",
            "prod_id, name, price, stock, desc_id, cate_id",
            "from shop_product",
            "where cate_id = #{cateId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column="prod_id", property="prodId", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
            @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
            @Result(column="stock", property="stock", jdbcType=JdbcType.INTEGER),
            @Result(column="desc_id", property="descId", jdbcType=JdbcType.INTEGER),
            @Result(column="cate_id", property="cateId", jdbcType=JdbcType.INTEGER),
            @Result(property = "desc",column = "desc_id",
                    one = @One(select = "com.answer.server.mapper.DescMapper.selectByPrimaryKey"))
    })
    List<Product> selectByCateId(Integer cateId);


    @UpdateProvider(type=ProductSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    @UpdateProvider(type=ProductSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    @UpdateProvider(type=ProductSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Product record);

    @Update({
        "update shop_product",
        "set name = #{name,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=DECIMAL},",
          "stock = #{stock,jdbcType=INTEGER},",
          "desc_id = #{descId,jdbcType=INTEGER},",
          "cate_id = #{cateId,jdbcType=INTEGER}",
        "where prod_id = #{prodId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Product record);
}