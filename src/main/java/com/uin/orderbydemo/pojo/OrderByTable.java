package com.uin.orderbydemo.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author wanglufei
 * @since 2022-09-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ORDER_BY_TABLE")
@ApiModel(value = "OrderByTable对象", description = "")
public class OrderByTable implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId("ID")
    private String id;

    @ApiModelProperty(value = "分数")
    @TableField("SCORE")
    private Integer score;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATED_TIME")
    private Date createdTime;

}
