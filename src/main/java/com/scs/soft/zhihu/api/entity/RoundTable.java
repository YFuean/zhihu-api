package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName RoundTable
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/1/17
 **/
@Data
@Builder
public class RoundTable {
    private Integer id;
    private String name;
    private String banner;
    private String urlToken;
    private Integer visitsCount;
    private Integer includeCount;
}
