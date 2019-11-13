package com.psj.starter.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.psj.starter.bean.entity.BaseEntiry;

public interface BaseService<T extends BaseEntiry> {

    T getById(String id);

}
