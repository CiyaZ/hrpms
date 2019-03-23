package com.ciyaz.hrpms.domain;

import java.io.Serializable;

/**
 * 账户实体类
 *
 * @author CiyaZ
 */
public class Account implements Serializable
{
	private Long accountId;
	private String accountName;
	private Long accountTypeId;
	private Long userId;

	public Long getAccountId()
	{
		return accountId;
	}

	public void setAccountId(Long accountId)
	{
		this.accountId = accountId;
	}

	public String getAccountName()
	{
		return accountName;
	}

	public void setAccountName(String accountName)
	{
		this.accountName = accountName;
	}

	public Long getAccountTypeId()
	{
		return accountTypeId;
	}

	public void setAccountTypeId(Long accountTypeId)
	{
		this.accountTypeId = accountTypeId;
	}

	public Long getUserId()
	{
		return userId;
	}

	public void setUserId(Long userId)
	{
		this.userId = userId;
	}

	@Override
	public String toString()
	{
		return "Account{" +
				"accountId=" + accountId +
				", accountName='" + accountName + '\'' +
				", accountTypeId=" + accountTypeId +
				", userId=" + userId +
				'}';
	}
}
