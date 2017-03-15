package com.angilin.rpc.model;

import java.io.Serializable;
import java.util.List;

public class SysAccountObj implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String accountName;
	
	private String accountNickName;
	
	private List<Object> pets;
	
	public SysAccountObj(){
		
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNickName() {
		return accountNickName;
	}

	public void setAccountNickName(String accountNickName) {
		this.accountNickName = accountNickName;
	}

	public List<Object> getPets() {
		return pets;
	}

	public void setPets(List<Object> pets) {
		this.pets = pets;
	}

	
}
