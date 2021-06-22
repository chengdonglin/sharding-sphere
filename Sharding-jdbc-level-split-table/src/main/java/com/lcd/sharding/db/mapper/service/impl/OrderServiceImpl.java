package com.lcd.sharding.db.mapper.service.impl;

import com.lcd.sharding.db.mapper.entity.Order;
import com.lcd.sharding.db.mapper.mapper.OrderMapper;
import com.lcd.sharding.db.mapper.service.OrderService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
