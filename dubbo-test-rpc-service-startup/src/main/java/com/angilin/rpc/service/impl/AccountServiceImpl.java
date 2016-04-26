package com.angilin.rpc.service.impl;

import com.angilin.rpc.model.SysAccountObj;
import com.angilin.rpc.service.AccountService;

public class AccountServiceImpl implements AccountService{

	public SysAccountObj login(String accountName, String password){
		
		SysAccountObj account = new SysAccountObj();
		if("admin".equals(accountName)){
			account.setAccountName("admin");
			account.setAccountNickName("管理员");
		}
		return account;
	}
}
