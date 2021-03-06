package com.scs.soft.zhihu.api.controller;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.RoundTableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ValueConstants;

import javax.annotation.Resource;

/**
 * @ClassName RoundTableController
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/1/18
 **/
@RestController
@RequestMapping(value = "/api/roundtable")
public class RoundTableController {
    @Resource
    private RoundTableService roundTableService;
    @GetMapping
    public Result getHot(){
        return Result.success(roundTableService.selectHot());
    }
    @GetMapping(value = "/all")
    public Result getAll(){
        return Result.success(roundTableService.selectAll());
    }
}
