package com.ciyaz.hrpms.service;

import com.ciyaz.hrpms.domain.AccountType;

import java.util.List;

/**
 * @author CiyaZ
 */
public interface AccountService
{
	/**
	 * 获取储蓄账户类型列表
	 *
	 * @return 储蓄账户类型列表
	 */
	List<AccountType> getAccountTypeList();

	/**
	 * 删除账户类型
	 *
	 * @param accountTypeId 账户类型ID
	 */
	void deleteAccountType(Long accountTypeId);

	/**
	 * 添加账户类型
	 *
	 * @param accountTypeName 账户类型名
	 */
	void addAccountType(String accountTypeName);
}
