package com.ciyaz.hrpms.service;

import com.ciyaz.hrpms.domain.Role;

import java.util.List;

/**
 * @author CiyaZ
 */
public interface RoleService
{
	/**
	 * 通过角色ID查询Role
	 *
	 * @param roleId 角色ID
	 * @return 角色实体类
	 */
	Role getRoleById(Long roleId);

	/**
	 * 根据用户ID查询该用户所有角色
	 *
	 * @param userId 用户ID
	 * @return 用户角色列表
	 */
	List<Role> getRoleListByUserId(Long userId);
}
