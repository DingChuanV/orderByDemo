package com.uin.orderbydemo.service.impl;

import java.util.Date;
import java.util.UUID;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uin.orderbydemo.mapper.OrderByTableMapper;
import com.uin.orderbydemo.pojo.OrderByTable;
import com.uin.orderbydemo.service.IOrderByTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author wanglufei
 * @since 2022-09-20
 */
@Service
public class OrderByTableServiceImpl extends ServiceImpl<OrderByTableMapper, OrderByTable> implements IOrderByTableService {
    @Resource
    OrderByTableMapper orderByTableMapper;

    @Override
    public int addOrder(Integer score) {
        OrderByTable table = new OrderByTable();
        table.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        table.setScore(score);
        table.setCreatedTime(new Date());
        int insert = orderByTableMapper.addOrder(table);
        if (insert > 0) {
            return insert;
        }
        return 0;
    }
}
