package com.answer.server.mapper;

import com.answer.server.model.Desc;
import com.answer.server.model.DescExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface DescMapper {
    @SelectProvider(type=DescSqlProvider.class, method="countByExample")
    int countByExample(DescExample example);

    @DeleteProvider(type=DescSqlProvider.class, method="deleteByExample")
    int deleteByExample(DescExample example);

    @Delete({
        "delete from shop_desc",
        "where desc_id = #{descId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer descId);

    @Insert({
        "insert into shop_desc (desc_id, prod_service, ",
        "prod_comment, img_src)",
        "values (#{descId,jdbcType=INTEGER}, #{prodService,jdbcType=VARCHAR}, ",
        "#{prodComment,jdbcType=VARCHAR}, #{imgSrc,jdbcType=VARCHAR})"
    })
    int insert(Desc record);

    @Insert({
            "insert into shop_desc (prod_service, ",
            "prod_comment, img_src)",
            "values (#{prodService,jdbcType=VARCHAR}, ",
            "#{prodComment,jdbcType=VARCHAR}, #{imgSrc,jdbcType=VARCHAR})"
    })
    int insertDesc(Desc record);

    @InsertProvider(type=DescSqlProvider.class, method="insertSelective")
    int insertSelective(Desc record);

    @SelectProvider(type=DescSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="desc_id", property="descId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="prod_service", property="prodService", jdbcType=JdbcType.VARCHAR),
        @Result(column="prod_comment", property="prodComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="img_src", property="imgSrc", jdbcType=JdbcType.VARCHAR)
    })
    List<Desc> selectByExample(DescExample example);

    @Select({
        "select",
        "desc_id, prod_service, prod_comment, img_src",
        "from shop_desc",
        "where desc_id = #{descId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="desc_id", property="descId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="prod_service", property="prodService", jdbcType=JdbcType.VARCHAR),
        @Result(column="prod_comment", property="prodComment", jdbcType=JdbcType.VARCHAR),
        @Result(column="img_src", property="imgSrc", jdbcType=JdbcType.VARCHAR)
    })
    Desc selectByPrimaryKey(Integer descId);

    @Select({
            "select",
            "desc_id",
            "from shop_desc",
            "order by desc_id ",
            "desc"
    })
    @Results({
            @Result(column="desc_id", property="descId", jdbcType=JdbcType.INTEGER, id=true),
    })
    List<Integer> selectDescId();

    @UpdateProvider(type=DescSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Desc record, @Param("example") DescExample example);

    @UpdateProvider(type=DescSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Desc record, @Param("example") DescExample example);

    @UpdateProvider(type=DescSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Desc record);

    @Update({
        "update shop_desc",
        "set prod_service = #{prodService,jdbcType=VARCHAR},",
          "prod_comment = #{prodComment,jdbcType=VARCHAR},",
          "img_src = #{imgSrc,jdbcType=VARCHAR}",
        "where desc_id = #{descId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Desc record);
}