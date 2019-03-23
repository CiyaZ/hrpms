package com.ciyaz.hrpms.service;

import com.ciyaz.hrpms.domain.User;

/**
 * 用户登录
 *
 * @author CiyaZ
 */
public interface UserService
{
	/**
	 * 登录
	 *
	 * @param username 用户名
	 * @param password 密码
	 * @return 登录成功返回用户实体类，登录失败返回null
	 */
	User login(String username, String password);

	/**
	 * 用户登出
	 *
	 * @param userId 用户ID
	 */
	void logout(Long userId);
}
