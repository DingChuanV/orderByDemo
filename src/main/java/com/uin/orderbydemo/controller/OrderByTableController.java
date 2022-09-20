package com.uin.orderbydemo.controller;


import com.uin.orderbydemo.config.AjaxResult;
import com.uin.orderbydemo.service.IOrderByTableService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wanglufei
 * @since 2022-09-20
 */
@RestController
@RequestMapping("/order-by-table")
@Api
public class OrderByTableController {
    @Resource
    IOrderByTableService orderByTableService;

    @PostMapping("/add")
    @ApiOperation("新增")
    public AjaxResult addOrder(@RequestParam Integer score) {
        int res = orderByTableService.addOrder(score);
        if (res > 0) {
            return AjaxResult.success("新增成功");
        }
        return AjaxResult.error("新增失败");
    }

}
