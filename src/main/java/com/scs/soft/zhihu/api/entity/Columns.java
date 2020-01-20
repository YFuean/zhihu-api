package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName Columns
 * @Description 专栏类
 * @Author yue_fan
 * @Date 2020/1/19
 **/
@Data
@Builder
public class Columns {
    private Integer columnsId;
    private String title;
    private String description;
    private String url;
    private String imageUrl;
    private Integer followers;
    private Integer articlesCount;
}
