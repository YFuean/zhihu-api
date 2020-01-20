package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;
/**
 * @ClassName User
 * @Description 标签类
 * @Author yue_fan
 * @Date 2020/1/15
 **/
@Data
@Builder
public class Section {
    private String sectionId;
    private String specialId;
    private String sectionTitle;
}
