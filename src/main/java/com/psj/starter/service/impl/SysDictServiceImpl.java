package com.psj.starter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.psj.starter.bean.entity.SysDict;
import com.psj.starter.mapper.SysDictMapper;
import com.psj.starter.service.ISysDictService;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 字典表 服务实现类
 * </p>
 *
 * @author psj
 * @since 2019-10-06
 */
@Service
public class SysDictServiceImpl extends ServiceImpl<SysDictMapper, SysDict> implements ISysDictService {

}
