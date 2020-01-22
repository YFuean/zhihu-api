package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.ColumnsService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName ColumnsController
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/1/22
 **/
@RestController
@RequestMapping (value = "/api")
public class ColumnsController {
    @Resource
    private ColumnsService columnsService;
    @GetMapping(value = "/columns")
    public Result getHot(){
        return Result.success(columnsService.selectHot());
    }
    @GetMapping(value = "/zhuanlan/columns/random")
    public Result getRandom(){
        return Result.success(columnsService.selectRandom());
    }
}
