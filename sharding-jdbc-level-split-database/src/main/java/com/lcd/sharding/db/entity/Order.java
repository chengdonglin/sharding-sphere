package com.lcd.sharding.db.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@TableName(value = "order")
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    /**
     * 订单id
     */
    @TableId(value = "order_id")
    private Long orderId;

    /**
     * 订单价格
     */
    @TableField(value = "price")
    private BigDecimal price;

    /**
     * 下单用户id
     */
    @TableField(value = "user_id")
    private Integer userId;

    /**
     * 订单状态
     */
    @TableField(value = "status")
    private String status;

    public static final String COL_ORDER_ID = "order_id";

    public static final String COL_PRICE = "price";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_STATUS = "status";
}