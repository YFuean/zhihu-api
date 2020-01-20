package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Favorite;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName FavoriteService
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/1/20
 **/
public interface FavoriteService {
    /**
     * 查询火热4个
     * @return List<Favorite>
     */
    List<Favorite> selectHot();

    /**
     * 查询所有
     * @return List<Favorite>
     */
    List<Favorite> selectAll();
}
