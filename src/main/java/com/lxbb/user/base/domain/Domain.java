package com.lxbb.user.base.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.ZonedDateTime;

/**
 * @description:
 * @version: 1.0
 * @author: zhaowei.zhang01@hand-china.com
 * @date: 2019/4/19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
abstract public class Domain extends BaseObject {

    @TableField(fill = FieldFill.INSERT)
    protected ZonedDateTime createdDate;

    @TableField(fill = FieldFill.INSERT)
    protected Long createdBy;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    protected ZonedDateTime lastUpdatedDate;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    protected Long lastUpdatedBy;

}