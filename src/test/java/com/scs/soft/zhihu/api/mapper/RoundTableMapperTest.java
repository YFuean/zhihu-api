package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.RoundTable;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = ZhihuApiApplication.class)
class RoundTableMapperTest {
    @Resource
    private RoundTableMapper roundTableMapper;
    @Test
    void selectHot() {
        List<RoundTable> list = roundTableMapper.selectHot();
        list.forEach(System.out::println);
    }

    @Test
    void selectAll() {
        List<RoundTable> list = roundTableMapper.selectAll();
        list.forEach(System.out::println);
    }
}