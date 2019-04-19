package com.lxbb.user.user.persistence;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.lxbb.user.user.domain.SysUserBase;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户基础信息表(SysUserBase)表Mapper接口
 *
 * @author zhaowei.zhang01@hand-china.com
 * @since 2019-04-19 22:21:52
 */
@Mapper
public interface SysUserBaseMapper extends BaseMapper<SysUserBase> {

}