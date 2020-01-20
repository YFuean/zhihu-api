package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Favorite;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName Favorite
 * @Description 收藏夹
 * @Author yue_fan
 * @Date 2020/1/20
 **/
public interface FavoriteMapper {
    /**
     * 按照火热度查询4个
     * @return List<Favorite>
     */
    @Select("SELECT * From t_favorite ORDER BY followers DESC LIMIT 0,4")
    List<Favorite> selectHot();

    /**
     * 查询所有，按火热度排序
     * @return List<Favorite>
     */
    @Select("SELECT * FROM t_favorite")
    @Results({
            @Result(id = true,property = "favoriteId",column = "id",javaType = Integer.class),
            @Result(property = "title",column = "title",javaType = String.class),
            @Result(property = "creatorName",column = "creator_name",javaType = String.class),
            @Result(property = "creatorAvatar",column = "creator_avatar",javaType = String.class),
            @Result(property = "followers",column = "followers",javaType = Integer.class),
            @Result(property = "totalCount",column = "total_count",javaType = Integer.class),
            @Result(property = "questionTitle",column = "question_title",javaType = String.class),
            @Result(property = "answerAuthorName",column = "answer_author_name",javaType = String.class),
            @Result(property = "answerContent",column = "answer_content",javaType = String.class),
            @Result(property = "voteupCount",column = "voteup_count",javaType = Integer.class),
            @Result(property = "commentCount",column = "comment_count",javaType = Integer.class),
    })
    List<Favorite> selectAll();
}
