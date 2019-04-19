package com.lxbb.user.user.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.lxbb.user.base.domain.Domain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
/**
 * @description 令牌认证表(sys_token_table)表实体类
 * @author zhaowei.zhang01@hand-china.com
 * @date 2019-04-19 23:51:02
 */
 
@TableName(value = "sys_token_table")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysTokenTable extends Domain {
    /**
      租户id 
    */
    @TableField(value = "tenant_id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long tenantId;
    
    @TableField(value = "token")
    private String token;
    
    @TableField(value = "token_state")
    private Integer tokenState;
    
    @TableField(value = "star_date")
    private ZonedDateTime starDate;
    
    @TableField(value = "end_date")
    private ZonedDateTime endDate;
    
    @TableField(value = "user_id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long userId;
    
    /**
      启用标志 
    */
    @TableField(value = "enable_flag")
    private Integer enableFlag;
    
    /**
      删除标志 
    */
    @TableField(value = "delete_flag")
    private Integer deleteFlag;
    
    /**
      创建者 
    */
    @TableField(value = "create_by")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long createBy;
    
    /**
      创建日期 
    */
    @TableField(value = "create_date")
    private ZonedDateTime createDate;
    
    /**
      最近修改人 
    */
    @TableField(value = "update_by")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long updateBy;
    
    /**
      最近修改日期 
    */
    @TableField(value = "update_date")
    private ZonedDateTime updateDate;
    
}