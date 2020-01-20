package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Favorite;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = ZhihuApiApplication.class)
class FavoriteMapperTest {
    @Resource
    private FavoriteMapper favoriteMapper;
    @Test
    void selectHot() {
        List<Favorite> list = favoriteMapper.selectHot();
        list.forEach(System.out::println);
    }

    @Test
    void selectAll() {
        List<Favorite> list = favoriteMapper.selectAll();
        list.forEach(System.out::println);
    }
}