package com.angilin.rpc.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.angilin.rpc.model.Cat;
import com.angilin.rpc.model.Mouse;
import com.angilin.rpc.model.SysAccountObj;
import com.angilin.rpc.service.AccountService;

public class AccountServiceImpl implements AccountService{

	public SysAccountObj login(String accountName, String password){
		
		SysAccountObj account = new SysAccountObj();
		if("admin".equals(accountName)){
			account.setAccountName("admin");
			account.setAccountNickName("管理员");
			Mouse mouse = new Mouse();
			mouse.setMouseName("Jerry");
			Cat cat = new Cat();
			cat.setCatName("Tom");
			List<Object> pets = new ArrayList<Object>();
			pets.add(cat);
			pets.add(mouse);
			account.setPets(pets);
		}
		return account;
	}
}
