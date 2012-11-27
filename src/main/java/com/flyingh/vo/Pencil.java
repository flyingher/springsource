package com.flyingh.vo;

public class Pencil {
	private String color;

	public Pencil() {
		super();
	}

	public Pencil(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Pencil [color=" + color + "]";
	}
	
}
