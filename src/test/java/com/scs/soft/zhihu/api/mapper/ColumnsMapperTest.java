package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Columns;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = ZhihuApiApplication.class)
class ColumnsMapperTest {
    @Resource
    private ColumnsMapper columnsMapper;

    @Test
    void selectHot() {
        List<Columns> list = columnsMapper.selectHot();
        list.forEach(System.out::println);
    }

    @Test
    void selectRandom() {
        List<Columns> list = columnsMapper.selectRandom();
        list.forEach(System.out::println);
    }
}