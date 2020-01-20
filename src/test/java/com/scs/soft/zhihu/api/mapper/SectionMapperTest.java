package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Section;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = ZhihuApiApplication.class)
class SectionMapperTest {
    @Resource
    private SectionMapper sectionMapper;
    @Test
    void getSectionsBySpecialId() {
        List<Section> list = sectionMapper.getSectionsBySpecialId("19550340");
        list.forEach(System.out::println);
    }
}