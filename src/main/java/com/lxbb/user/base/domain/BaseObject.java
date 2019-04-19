package com.lxbb.user.base.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @version: 1.0
 * @author: zhaowei.zhang01@hand-china.com
 * @date: 2019/4/19
 */
@Data
abstract public class BaseObject implements Serializable {
    @TableId
    protected Long id;
}