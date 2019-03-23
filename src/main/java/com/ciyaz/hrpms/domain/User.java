package com.ciyaz.hrpms.domain;

import java.io.Serializable;

/**
 * 用户实体类
 *
 * @author CiyaZ
 */
public class User implements Serializable
{
	private Long userId;
	private String username;
	private String password;
	private Integer freezed;

	public Long getUserId()
	{
		return userId;
	}

	public void setUserId(Long userId)
	{
		this.userId = userId;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public Integer getFreezed()
	{
		return freezed;
	}

	public void setFreezed(Integer freezed)
	{
		this.freezed = freezed;
	}

	@Override
	public String toString()
	{
		return "User{" +
				"userId=" + userId +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", freezed=" + freezed +
				'}';
	}
}
