package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName Favorite
 * @Description 收藏夹类
 * @Author yue_fan
 * @Date 2020/1/19
 **/
@Data
@Builder
public class Favorite {
    private Integer favoriteId;
    private String title;
    private String creatorName;
    private String creatorAvatar;
    private Integer followers;
    private Integer totalCount;
    private String questionTitle;
    private String answerAuthorname;
    private String answerContent;
    private Integer voteupCount;
    private Integer commentCount;
}
