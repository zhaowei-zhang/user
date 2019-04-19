package com.lxbb.user.user.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.lxbb.user.base.domain.Domain;
import lombok.Data;

import java.time.ZonedDateTime;

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
    @JsonSerialize(using = ToStringSerializer.class)
    private Long tenantId;

    @TableField(value = "user_id")
    @JsonSerialize(using = ToStringSerializer.class)
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
    @JsonSerialize(using = ToStringSerializer.class)
    private Long dataId;

    /**
     * 启用标志
     */
    @TableField(value = "enable_flag")
    private Integer enableFlag;

    /**
     * 删除标志
     */
    @TableField(value = "delete_flag")
    private Integer deleteFlag;

    /**
     * 创建者
     */
    @TableField(value = "create_by")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long createBy;

    /**
     * 创建日期
     */
    @TableField(value = "create_date")
    private ZonedDateTime createDate;

    /**
     * 最近修改人
     */
    @TableField(value = "update_by")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long updateBy;

    /**
     * 最近修改日期
     */
    @TableField(value = "update_date")
    private ZonedDateTime updateDate;

}