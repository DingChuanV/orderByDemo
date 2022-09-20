package com.uin.orderbydemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uin.orderbydemo.pojo.OrderByTable;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author wanglufei
 * @since 2022-09-20
 */
public interface IOrderByTableService extends IService<OrderByTable> {
    /**
     * 新增用户
     *
     * @param score
     * @return int
     * @author wanglufei
     * @date 2022/9/20 10:27 PM
     */
    int addOrder(Integer score);
}
