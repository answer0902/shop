package com.answer.server.mapper;

import com.answer.server.model.Category;
import com.answer.server.model.CategoryExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface CategoryMapper {
    @SelectProvider(type=CategorySqlProvider.class, method="countByExample")
    int countByExample(CategoryExample example);

    @DeleteProvider(type=CategorySqlProvider.class, method="deleteByExample")
    int deleteByExample(CategoryExample example);

    @Delete({
        "delete from shop_category",
        "where cate_id = #{cateId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer cateId);

    @Insert({
        "insert into shop_category (cate_id, cate_name, ",
        "cate_img)",
        "values (#{cateId,jdbcType=INTEGER}, #{cateName,jdbcType=VARCHAR}, ",
        "#{cateImg,jdbcType=VARCHAR})"
    })
    int insert(Category record);

    @Insert({
            "insert into shop_category (cate_name, ",
            "cate_img)",
            "values (#{cateName,jdbcType=VARCHAR}, ",
            "#{cateImg,jdbcType=VARCHAR})"
    })
    int insertCate(Category record);

    @InsertProvider(type=CategorySqlProvider.class, method="insertSelective")
    int insertSelective(Category record);

    @SelectProvider(type=CategorySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="cate_id", property="cateId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="cate_name", property="cateName", jdbcType=JdbcType.VARCHAR),
        @Result(column="cate_img", property="cateImg", jdbcType=JdbcType.VARCHAR),
            @Result(property = "productList",column = "cate_id",
                    one = @One(select = "com.answer.server.mapper.ProductMapper.selectByCateId"))

    })
    List<Category> selectByExample(CategoryExample example);

    @Select({
        "select",
        "cate_id, cate_name, cate_img",
        "from shop_category",
        "where cate_id = #{cateId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="cate_id", property="cateId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="cate_name", property="cateName", jdbcType=JdbcType.VARCHAR),
        @Result(column="cate_img", property="cateImg", jdbcType=JdbcType.VARCHAR)
    })
    Category selectByPrimaryKey(Integer cateId);

    @UpdateProvider(type=CategorySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    @UpdateProvider(type=CategorySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    @UpdateProvider(type=CategorySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Category record);

    @Update({
        "update shop_category",
        "set cate_name = #{cateName,jdbcType=VARCHAR},",
          "cate_img = #{cateImg,jdbcType=VARCHAR}",
        "where cate_id = #{cateId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Category record);
}