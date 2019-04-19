package com.lxbb.user.user.persistence;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.lxbb.user.user.domain.SysTokenTable;
import org.apache.ibatis.annotations.Mapper;

/**
 * 令牌认证表(SysTokenTable)表Mapper接口
 *
 * @author zhaowei.zhang01@hand-china.com
 * @since 2019-04-19 23:51:02
 */
@Mapper
public interface SysTokenTableMapper extends BaseMapper<SysTokenTable> {

}