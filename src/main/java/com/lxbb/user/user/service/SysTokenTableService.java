package com.lxbb.user.user.service;

import com.lxbb.user.base.service.BaseService;
import com.lxbb.user.base.util.DateUtil;
import com.lxbb.user.user.domain.SysTokenTable;
import com.lxbb.user.user.domain.SysUserBase;
import com.lxbb.user.user.persistence.SysTokenTableMapper;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;

/**
 * 令牌认证表(SysTokenTable)表服务接口
 *
 * @author zhaowei.zhang01@hand-china.com
 * @since 2019-04-19 23:51:02
 */
@Service
public class SysTokenTableService extends BaseService<SysTokenTableMapper, SysTokenTable> {

    /**
     * 创建一次登陆
     *
     * @param user
     * @return
     */
    private SysTokenTable createToken(SysUserBase user) {
        SysTokenTable token = new SysTokenTable();
        token.setToken(UUID.randomUUID().toString());
        ZonedDateTime zdt = DateUtil.dateToZoneDateTime(new Date());
        //定义令牌起始时间
        token.setStarDate(zdt);
        //定义令牌结束时间（有效期/分钟）
        token.setEndDate(zdt.plusMinutes(2));
        token.setUserId(user.getUserId());
        token.setTokenState(1);
        token.setEnableFlag(1);
        token.setDeleteFlag(0);
        token.setTenantId(user.getTenantId());
        this.insert(token);
        return token;
    }

    /**
     * 登陆/返回token
     *
     * @param user
     * @return
     */
    public String login(SysUserBase user) {
        SysTokenTable token = createToken(user);
        return token.getToken();
    }

}