package com.ciyaz.hrpms.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @author CiyaZ
 */
public interface AccountMapper
{

	/**
	 * 根据账户类型ID将所有该类型下账户类型更新为无分类
	 *
	 * @param accountTypeId 账户类型ID
	 */
	void resetAccountsByAccountTypeId(@Param("accountTypeId") Long accountTypeId);
}
