package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.RoundTable;

import java.util.List;

/**
 * @ClassName RoundTableService
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/1/18
 **/
public interface RoundTableService {
    /**
     * 查询火热圆桌
     * @return List<RoundTable>
     */
    List<RoundTable> selectHot();

    /**
     * 查询所有圆桌
     * @return List<RoundTable>
     */
    List<RoundTable> selectAll();
}
