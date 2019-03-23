package com.ciyaz.hrpms.domain;

import java.io.Serializable;

/**
 * 角色实体类
 *
 * @author CiyaZ
 */
public class Role implements Serializable
{
	private Long roleId;
	private String roleName;

	public Long getRoleId()
	{
		return roleId;
	}

	public void setRoleId(Long roleId)
	{
		this.roleId = roleId;
	}

	public String getRoleName()
	{
		return roleName;
	}

	public void setRoleName(String roleName)
	{
		this.roleName = roleName;
	}

	@Override
	public String toString()
	{
		return "Role{" +
				"roleId=" + roleId +
				", roleName='" + roleName + '\'' +
				'}';
	}
}
