package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Columns;

import java.util.List;

/**
 * @ClassName ColumnsService
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/1/22
 **/
public interface ColumnsService {
    /**
     * 查询4个最热的
     * @return List<Columns>
     */
    List<Columns> selectHot();

    /**
     * 查询随机8个
     * @return List<Columns>
     */
    List<Columns> selectRandom();
}
