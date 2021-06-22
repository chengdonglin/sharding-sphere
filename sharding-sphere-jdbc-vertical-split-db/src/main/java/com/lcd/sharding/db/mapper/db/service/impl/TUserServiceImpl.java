package com.lcd.sharding.db.mapper.db.service.impl;

import com.lcd.sharding.db.mapper.db.entity.TUser;
import com.lcd.sharding.db.mapper.db.mapper.TUserMapper;
import com.lcd.sharding.db.mapper.db.service.TUserService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {

}
