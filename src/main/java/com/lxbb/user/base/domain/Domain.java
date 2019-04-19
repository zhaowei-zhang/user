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

    /**
     创建者
     */
    @TableField(fill = FieldFill.INSERT)
    private Long createBy;

    /**
     创建日期
     */
    @TableField(fill = FieldFill.INSERT)
    private ZonedDateTime createDate;

    /**
     最近修改人
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateBy;

    /**
     最近修改日期
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private ZonedDateTime updateDate;

}