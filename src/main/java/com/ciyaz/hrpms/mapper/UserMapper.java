package com.ciyaz.hrpms.mapper;

import com.ciyaz.hrpms.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author CiyaZ
 */
public interface UserMapper
{
	/**
	 * 根据用户ID查询用户
	 *
	 * @param userId 用户ID
	 * @return 用户实体类
	 */
	User getUserById(@Param("userId") Long userId);

	/**
	 * 根据唯一用户名查询用户
	 *
	 * @param username 用户名
	 * @return 用户实体类
	 */
	User getUserByUsername(@Param("username") String username);
}
