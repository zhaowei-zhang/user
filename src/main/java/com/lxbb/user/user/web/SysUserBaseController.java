package com.lxbb.user.user.web;

import com.lxbb.user.user.domain.SysUserBase;
import com.lxbb.user.user.service.SysUserBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户基础信息表(SysUserBase)表控制层
 *
 * @author zhaowei.zhang01@hand-china.com
 * @since 2019-04-19 22:21:51
 */
@RestController
@RequestMapping("/api/sys/user/base")
public class SysUserBaseController {

    @Autowired
    private SysUserBaseService sysUserBaseService;

    @PostMapping(value = "/login")
    public String login(
            @RequestBody SysUserBase user) {
        return sysUserBaseService.loginGetToken(user.getUserName(), user.getUserPass());
    }


}