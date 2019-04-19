package com.lxbb.user.user.web;

import com.lxbb.user.user.domain.SysTokenTable;
import com.lxbb.user.user.service.SysTokenTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 令牌认证表(SysTokenTable)表控制层
 *
 * @author zhaowei.zhang01@hand-china.com
 * @since 2019-04-19 23:51:02
 */
@RestController
@RequestMapping("/api/sys/token/table")
public class SysTokenTableController {

    @Autowired
    private SysTokenTableService sysTokenTableService;


}