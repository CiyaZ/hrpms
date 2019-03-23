package com.ciyaz.hrpms.mapper;

import com.ciyaz.hrpms.domain.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author CiyaZ
 */
public interface RoleMapper
{
	/**
	 * 根据角色ID查询角色
	 *
	 * @param roleId 角色ID
	 * @return 角色实体类
	 */
	Role getRoleById(@Param("roleId") Long roleId);

	/**
	 * 根据用户ID查询角色
	 *
	 * @param userId 用户ID
	 * @return 该用户的角色列表
	 */
	List<Role> getRoleListByUserId(@Param("userId") Long userId);
}
