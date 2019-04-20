package com.lxbb.user.user.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.lxbb.user.base.domain.Domain;
import lombok.Data;

/**
 * @author zhaowei.zhang01@hand-china.com
 * @description 用户基础信息表(sys_user_base)表实体类
 * @date 2019-04-19 22:21:49
 */

@TableName(value = "sys_user_base")
@Data
public class SysUserBase extends Domain {
    /**
     * 租户id
     */
    @TableField(value = "tenant_id")
    private Long tenantId;

    @TableField(value = "user_id")
    private Long userId;

    /**
     * 用户code
     */
    @TableField(value = "user_code")
    private String userCode;

    /**
     * 角色code
     */
    @TableField(value = "role_code")
    private String roleCode;

    /**
     * 用户账号
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 用户密码
     */
    @TableField(value = "user_pass")
    private String userPass;

    /**
     * 等级
     */
    @TableField(value = "user_level")
    private Integer userLevel;

    /**
     * 详情id
     */
    @TableField(value = "data_id")
    private Long dataId;




}