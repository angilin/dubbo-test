package com.angilin.rpc.service;

import com.angilin.rpc.model.SysAccountObj;

public interface AccountService {

	public SysAccountObj login(String accountName, String password);
}
