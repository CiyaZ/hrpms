package com.ciyaz.hrpms.controller;

import com.ciyaz.hrpms.domain.AccountType;
import com.ciyaz.hrpms.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author CiyaZ
 */
@Controller
public class AccountTypeManageController
{
	private final AccountService accountService;

	@Autowired
	public AccountTypeManageController(AccountService accountService)
	{
		this.accountService = accountService;
	}

	@RequestMapping(value = "/accountTypeManage", method = RequestMethod.GET)
	public String getAccountTypePage()
	{
		return "account_type_manage";
	}

	@ResponseBody
	@RequestMapping(value = "/accountTypeList", method = RequestMethod.GET)
	public List<AccountType> getAccountTypeList()
	{
		return accountService.getAccountTypeList();
	}

	@ResponseBody
	@RequestMapping(value = "/deleteAccountType", method = RequestMethod.GET)
	public String deleteAccountType(@RequestParam Long accountTypeId)
	{
		accountService.deleteAccountType(accountTypeId);
		return "{\"msg\":\"success\"}";
	}

	@ResponseBody
	@RequestMapping(value = "/addAccountType", method = RequestMethod.POST)
	public String addAccountType(@RequestParam String accountType)
	{
		if (!"".equals(accountType) && accountType.length() <= 20)
		{
			accountService.addAccountType(accountType);
			return "{\"msg\":\"success\"}";
		}
		else
		{
			return "{\"msg\":\"failed\"}";
		}
	}
}
