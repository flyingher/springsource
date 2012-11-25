package com.flyingh.vo;

public class Apple {
	private String name;
	private float weight;

	public Apple() {
		System.out.println("Apple.Apple()");
	}

	public Apple(String name, float weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
}
