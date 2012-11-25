package com.flyingh.vo;

public abstract class Boy {
	private String name;

	public abstract Dog newDog();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
