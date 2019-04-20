package com.lxbb.user.base.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.sql.Timestamp;

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
    private Timestamp createDate;

    /**
     最近修改人
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Long updateBy;

    /**
     最近修改日期
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Timestamp updateDate;

    /**
     * 启用标志
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Integer enableFlag;

    /**
     * 删除标志
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Integer deleteFlag;
}