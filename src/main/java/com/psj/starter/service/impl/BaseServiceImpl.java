package com.psj.starter.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.psj.starter.bean.entity.BaseEntiry;
import com.psj.starter.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: jluzh-psj-starter
 * @description: 通用服务层类
 * @author: DemonsPan
 * @create: 2019-11-08 16:56
 **/
@Service
@Slf4j
public class BaseServiceImpl<M extends BaseMapper<T>, T extends BaseEntiry> extends ServiceImpl<M, T> implements BaseService<T> {
    @Autowired
    M baseMapper;

    @Override
    public T getById(String id) {
        log.info("Service : " + id);
        T result = baseMapper.selectById(id);
        log.info("查询id： " + result.getId());
        return result;
    }
}
