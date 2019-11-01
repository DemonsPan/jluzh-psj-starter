package com.psj.starter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.psj.starter.bean.entity.SysConfig;
import com.psj.starter.mapper.SysConfigMapper;
import com.psj.starter.service.ISysConfigService;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统配置表 服务实现类
 * </p>
 *
 * @author psj
 * @since 2019-10-06
 */
@Service
public class SysConfigServiceImpl extends ServiceImpl<SysConfigMapper, SysConfig> implements ISysConfigService {

}
