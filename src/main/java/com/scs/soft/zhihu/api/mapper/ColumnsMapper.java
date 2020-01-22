package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Columns;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName ColumnsMapper
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/1/21
 **/
public interface ColumnsMapper {
    /**
     * 按关注查找火热的4条
     * @return List<Columns>
     */
    @Select("SELECT * FROM t_columns ORDER BY followers LIMIT 0,4")
    List<Columns> selectHot();

    /**
     *随机查询8条数据
     * @return List<Columns>
     */
    @Select("SELECT * FROM t_columns ORDER BY RAND() LIMIT 8")
    @Results({
            @Result(id = true,property = "columnsId",column = "id",javaType = Integer.class),
            @Result(property = "title",column = "title",javaType = String.class),
            @Result(property = "description",column = "description",javaType = String.class),
            @Result(property = "url",column = "url",javaType = String.class),
            @Result(property = "imageUrl",column = "image_url",javaType = String.class),
            @Result(property = "followers",column = "followers",javaType = Integer.class),
            @Result(property = "articlesCount",column = "articles_count",javaType = Integer.class),
    })
    List<Columns> selectRandom();
}
