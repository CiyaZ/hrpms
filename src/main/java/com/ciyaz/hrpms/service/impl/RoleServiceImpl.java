package com.ciyaz.hrpms.service.impl;

import com.ciyaz.hrpms.domain.Role;
import com.ciyaz.hrpms.mapper.RoleMapper;
import com.ciyaz.hrpms.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author CiyaZ
 */
@Transactional(rollbackFor = Exception.class)
@Service("roleService")
public class RoleServiceImpl implements RoleService
{
	private final RoleMapper roleMapper;

	@Autowired
	public RoleServiceImpl(RoleMapper roleMapper)
	{
		this.roleMapper = roleMapper;
	}

	@Override
	public Role getRoleById(Long roleId)
	{
		return roleMapper.getRoleById(roleId);
	}

	@Override
	public List<Role> getRoleListByUserId(Long userId)
	{
		return roleMapper.getRoleListByUserId(userId);
	}
}
