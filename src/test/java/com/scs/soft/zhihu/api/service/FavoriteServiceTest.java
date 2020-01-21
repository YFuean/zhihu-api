package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Favorite;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = ZhihuApiApplication.class)
class FavoriteServiceTest {
    @Resource
    private FavoriteService favoriteService;
    @Test
    void selectByPage() {
        List<Favorite> list = favoriteService.selectByPage(2,5);
        list.forEach(System.out::println);
    }
}