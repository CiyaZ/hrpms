package com.ciyaz.hrpms.mapper;

import com.ciyaz.hrpms.domain.AccountType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author CiyaZ
 */
public interface AccountTypeMapper
{
	/**
	 * 获取储蓄账户类型列表
	 *
	 * @return 储蓄账户类型列表
	 */
	List<AccountType> getAccountTypeList();

	/**
	 * 根据账户类型ID删除账户类型记录
	 *
	 * @param accountTypeId 账户类型ID
	 */
	void deleteAccountTypeById(@Param("accountTypeId") Long accountTypeId);

	/**
	 * 添加账户类型名称
	 *
	 * @param accountTypeName 账户类型名称
	 */
	void addAccountType(@Param("accountTypeName") String accountTypeName);
}
