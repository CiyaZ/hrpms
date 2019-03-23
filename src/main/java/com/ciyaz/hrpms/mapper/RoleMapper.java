package com.ciyaz.hrpms.mapper;

import com.ciyaz.hrpms.domain.Role;
import org.apache.ibatis.annotations.Param;

/**
 * 角色查询mapper
 *
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
}
