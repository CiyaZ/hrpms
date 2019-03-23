package com.ciyaz.hrpms.service.impl;

import com.ciyaz.hrpms.domain.User;
import com.ciyaz.hrpms.mapper.UserMapper;
import com.ciyaz.hrpms.service.UserService;
import com.ciyaz.hrpms.util.HashUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author CiyaZ
 */
@Transactional(rollbackFor = Exception.class)
@Service("userService")
public class UserServiceImpl implements UserService
{
	private final UserMapper userMapper;

	@Autowired
	public UserServiceImpl(UserMapper userMapper)
	{
		this.userMapper = userMapper;
	}

	@Override
	public User login(String username, String password)
	{
		User user = userMapper.getUserByUsername(username);
		if (user == null)
		{
			return null;
		}

		String realPasswordHash = user.getPassword();
		String passwordHash = HashUtil.getStrHash(password);
		if (realPasswordHash.equals(passwordHash))
		{
			return user;
		}
		else
		{
			return null;
		}
	}

	@Override
	public void logout(Long userId)
	{

	}
}
