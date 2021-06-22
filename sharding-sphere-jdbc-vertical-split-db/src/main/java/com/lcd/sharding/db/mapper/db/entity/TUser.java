package com.lcd.sharding.db.mapper.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@TableName(value = "t_user")
@NoArgsConstructor
@AllArgsConstructor
public class TUser {
    /**
     * 用户id
     */
    @TableId(value = "user_id")
    private Long userId;

    /**
     * 用户姓名
     */
    @TableField(value = "fullname")
    private String fullname;

    /**
     * 用户类型
     */
    @TableField(value = "user_type")
    private String userType;

    public static final String COL_USER_ID = "user_id";

    public static final String COL_FULLNAME = "fullname";

    public static final String COL_USER_TYPE = "user_type";
}