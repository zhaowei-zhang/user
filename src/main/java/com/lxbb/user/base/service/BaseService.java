package com.lxbb.user.base.service;

/**
 * @description:
 * @version: 1.0
 * @author: zhaowei.zhang01@hand-china.com
 * @date: 2019/4/19
 */

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;


abstract public class BaseService<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> {
    private static final Logger log = LoggerFactory.getLogger(BaseService.class);
    @Autowired
    protected DataSource dataSource;


    public EntityWrapper<T> getWrapper() {
        return new EntityWrapper<>();
    }

    public EntityWrapper<T> getWrapper(T entity) {
        return new EntityWrapper<>(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean updateById(T entity) {
        return checkUpdate(super.updateById(entity));
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean updateBatchById(List<T> entityList) {
        try {
            return checkUpdate(super.updateBatchById(entityList));
        } catch (RuntimeException e) {
            throw new RuntimeException();
        }
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean insertBatch(List<T> entityList) {
        try {
            return super.insertBatch(entityList);
        } catch (RuntimeException e) {
            throw new RuntimeException();
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean insertBatch(List<T> entityList, int batchSize) {
        try {
            return super.insertBatch(entityList, batchSize);
        } catch (RuntimeException e) {
            throw new RuntimeException();
        }

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean insertOrUpdateBatch(List<T> entityList) {
        try {
            return super.insertOrUpdateBatch(entityList);
        } catch (RuntimeException e) {
            throw new RuntimeException();
        }

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean insertOrUpdateBatch(List<T> entityList, int batchSize) {
        try {
            return super.insertOrUpdateBatch(entityList, batchSize);
        } catch (RuntimeException e) {
            throw new RuntimeException();
        }

    }

    boolean checkUpdate(boolean res) {
        if (!res) {
            throw new RuntimeException();
        }
        return res;
    }


    /**
     * 获取当前对象domain类型
     */
    private Class getDomainClass() {
        Class clz = this.getClass();
        Type type = clz.getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) type;
        return (Class) pt.getActualTypeArguments()[1];
    }
}
