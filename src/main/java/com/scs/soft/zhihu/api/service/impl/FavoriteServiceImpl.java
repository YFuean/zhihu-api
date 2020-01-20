package com.scs.soft.zhihu.api.service.impl;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.entity.Favorite;
import com.scs.soft.zhihu.api.mapper.FavoriteMapper;
import com.scs.soft.zhihu.api.service.FavoriteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName FavoriteServiceImpl
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/1/20
 **/
@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Resource
    private FavoriteMapper favoriteMapper;
    @Override
    public List<Favorite> selectHot() {
        return favoriteMapper.selectHot();
    }

    @Override
    public List<Favorite> selectAll() {
        return favoriteMapper.selectAll();
    }
}
