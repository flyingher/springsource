package com.flyingh.vo;

public class Worker extends Person {
	private float salary;

	public Worker() {
		super();
		System.out.println("Worker.Worker()");
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
