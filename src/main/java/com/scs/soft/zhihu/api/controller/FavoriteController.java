package com.scs.soft.zhihu.api.controller;

import com.scs.soft.zhihu.api.common.Result;
import com.scs.soft.zhihu.api.service.FavoriteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName FavoriteController
 * @Description TODO
 * @Author yue_fan
 * @Date 2020/1/20
 **/
@RestController
@RequestMapping (value = "/api/favorite")
public class FavoriteController {
    @Resource
    private FavoriteService favoriteService;
    @GetMapping
    public Result getHot(){return Result.success(favoriteService.selectHot());}
    @GetMapping(value = "/all")
    public Result getAll(){return Result.success(favoriteService.selectAll());}
}
