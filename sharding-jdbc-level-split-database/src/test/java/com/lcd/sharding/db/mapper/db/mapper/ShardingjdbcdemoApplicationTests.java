package com.lcd.sharding.db.mapper.db.mapper;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lcd.sharding.db.mapper.db.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ShardingjdbcdemoApplicationTests {

    @Autowired
    private OrderMapper orderMapper;

    /**
     * 新增操作
     */
    @Test
    public void addOrder() {
        for (int i =0;i<=10;i++) {
            Order order = new Order();
            order.setPrice(BigDecimal.valueOf(100 + i));
            order.setUserId(i);
            order.setStatus("订单数据desc" + i);
            orderMapper.insert(order);
        }
    }

    /**
     * 查询操作
     */
    @Test
    public void findOrder() {
        QueryWrapper<Order> wrapper = new QueryWrapper<Order>();
        wrapper.eq("user_id",1);
        wrapper.eq("order_id",1406913302732333058L);
        Order order = orderMapper.selectOne(wrapper);
        log.info("查询订单 {}",order);
    }
}
