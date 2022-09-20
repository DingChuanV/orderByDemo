package com.uin.orderbydemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uin.orderbydemo.pojo.OrderByTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wanglufei
 * @since 2022-09-20
 */
public interface OrderByTableMapper extends BaseMapper<OrderByTable> {

    int addOrder(@Param("table") OrderByTable table);
}
