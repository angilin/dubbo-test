package com.angilin.rpc.model;

import java.io.Serializable;

public class Cat implements Serializable{

	private static final long serialVersionUID = 1L;

	private String catName;

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}
}
