package com.ciyaz.hrpms.service.impl;

import com.ciyaz.hrpms.domain.AccountType;
import com.ciyaz.hrpms.mapper.AccountMapper;
import com.ciyaz.hrpms.mapper.AccountTypeMapper;
import com.ciyaz.hrpms.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author CiyaZ
 */
@Transactional(rollbackFor = Exception.class)
@Service("accountTypeService")
public class AccountServiceImpl implements AccountService
{
	private final AccountMapper accountMapper;
	private final AccountTypeMapper accountTypeMapper;

	@Autowired
	public AccountServiceImpl(AccountTypeMapper accountTypeMapper, AccountMapper accountMapper)
	{
		this.accountTypeMapper = accountTypeMapper;
		this.accountMapper = accountMapper;
	}

	@Override
	public List<AccountType> getAccountTypeList()
	{
		return accountTypeMapper.getAccountTypeList();
	}

	@Override
	public void deleteAccountType(Long accountTypeId)
	{
		accountMapper.resetAccountsByAccountTypeId(accountTypeId);
		accountTypeMapper.deleteAccountTypeById(accountTypeId);
	}

	@Override
	public void addAccountType(String accountTypeName)
	{
		accountTypeMapper.addAccountType(accountTypeName);
	}
}
