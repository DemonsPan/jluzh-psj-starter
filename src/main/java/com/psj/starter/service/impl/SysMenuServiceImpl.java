package com.psj.starter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.psj.starter.bean.entity.SysMenu;
import com.psj.starter.mapper.SysMenuMapper;
import com.psj.starter.service.ISysMenuService;

import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单管理 服务实现类
 * </p>
 *
 * @author psj
 * @since 2019-10-06
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements ISysMenuService {

}
