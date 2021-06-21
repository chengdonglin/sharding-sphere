package com.lcd.sharding.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lcd.sharding.mapper.OrderMapper;
import com.lcd.sharding.entity.Order;
import com.lcd.sharding.service.OrderService;
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
