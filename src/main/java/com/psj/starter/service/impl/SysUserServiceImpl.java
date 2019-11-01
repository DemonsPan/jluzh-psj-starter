package com.psj.starter.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.psj.starter.bean.entity.SysUser;
import com.psj.starter.mapper.SysUserMapper;
import com.psj.starter.service.ISysUserService;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户管理 服务实现类
 * </p>
 *
 * @author psj
 * @since 2019-10-06
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Override
    public List<SysUser> getAllUser() {
        return baseMapper.selectList(new QueryWrapper<SysUser>().ge("id", 1));
    }

}
