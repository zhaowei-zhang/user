package com.lxbb.user.user.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lxbb.user.base.exception.MyException;
import com.lxbb.user.base.exception.RespCode;
import com.lxbb.user.base.service.BaseService;
import com.lxbb.user.user.domain.SysUserBase;
import com.lxbb.user.user.persistence.SysUserBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户基础信息表(SysUserBase)表服务接口
 *
 * @author zhaowei.zhang01@hand-china.com
 * @since 2019-04-19 22:21:50
 */
@Service
public class SysUserBaseService extends BaseService<SysUserBaseMapper,SysUserBase> {

    @Autowired
    private SysTokenTableService sysTokenTableService;

    /**
     * 用户登陆逻辑/获取token
     * @param userName
     * @param userPass
     * @return
     */
    public String loginGetToken(String userName, String userPass) {
        SysUserBase user = null;
        String token = null;
        List<SysUserBase> userList = baseMapper.selectList(new EntityWrapper<SysUserBase>()
                .eq("user_name", userName)
                .eq("user_pass", userPass)
        );
        if (userList.size() == 0) {
            throw new MyException(RespCode.USERNAME_OR_USERPASS_ERROR);
        }
        else if (userList.size() != 1) {
            throw new MyException(RespCode.USERDATA_ABNORMAL);
        }
        else {
            user = userList.get(0);
        }
        if (user != null) {
            token = sysTokenTableService.login(user);
        }
        return token;
    }


    /**
     * 创建单条
     * @param userBase
     */
    public void createOne(SysUserBase userBase){
        baseMapper.insert(userBase);
    }

}