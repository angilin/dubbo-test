package com.angilin.rpc.model;

import java.io.Serializable;

public class Mouse implements Serializable{

	private static final long serialVersionUID = 1L;

	private String mouseName;

	public String getMouseName() {
		return mouseName;
	}

	public void setMouseName(String mouseName) {
		this.mouseName = mouseName;
	}
	
}
