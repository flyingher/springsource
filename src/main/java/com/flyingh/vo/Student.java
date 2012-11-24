package com.flyingh.vo;

public class Student extends Person {
	private float score;

	public Student() {
		super();
		System.out.println("Student.Student()");
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

}
