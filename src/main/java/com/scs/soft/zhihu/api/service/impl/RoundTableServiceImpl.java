package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.entity.RoundTable;
import com.scs.soft.zhihu.api.mapper.RoundTableMapper;
import com.scs.soft.zhihu.api.service.RoundTableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName RoundTableServiceImpl
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/1/18
 **/
@Service
public class RoundTableServiceImpl implements RoundTableService {
    @Resource
    private RoundTableMapper roundTableMapper;
    @Override
    public List<RoundTable> selectHot() {
        return roundTableMapper.selectHot();
    }

    @Override
    public List<RoundTable> selectAll() {
        return roundTableMapper.selectAll();
    }
}
