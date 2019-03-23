package com.ciyaz.hrpms.domain;

import java.io.Serializable;

/**
 * 账户类型实体类
 *
 * @author CiyaZ
 */
public class AccountType implements Serializable
{
	private Long accountTypeId;
	private String accountTypeName;

	public Long getAccountTypeId()
	{
		return accountTypeId;
	}

	public void setAccountTypeId(Long accountTypeId)
	{
		this.accountTypeId = accountTypeId;
	}

	public String getAccountTypeName()
	{
		return accountTypeName;
	}

	public void setAccountTypeName(String accountTypeName)
	{
		this.accountTypeName = accountTypeName;
	}

	@Override
	public String toString()
	{
		return "AccountType{" +
				"accountTypeId=" + accountTypeId +
				", accountTypeName='" + accountTypeName + '\'' +
				'}';
	}
}
