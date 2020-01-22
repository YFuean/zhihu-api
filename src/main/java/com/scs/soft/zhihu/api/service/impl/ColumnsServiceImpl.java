package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.entity.Columns;
import com.scs.soft.zhihu.api.mapper.ColumnsMapper;
import com.scs.soft.zhihu.api.service.ColumnsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName ColumnsServiceImpl
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/1/22
 **/
@Service
public class ColumnsServiceImpl implements ColumnsService {
    @Resource
    private ColumnsMapper columnsMapper;
    @Override
    public List<Columns> selectHot() {
        return columnsMapper.selectHot();
    }

    @Override
    public List<Columns> selectRandom() {
        return columnsMapper.selectRandom();
    }
}
