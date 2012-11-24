package com.flyingh.vo;

public class Student extends Person {
	private float score;

	public Student() {
		super();
		System.out.println("Student.Student()");
	}

	public Student(float score) {
		super();
		this.score = score;
		System.out.println("2:Student.Student()");
	}

	public Student(String name) {
		System.out.println("3:Student.Student()");
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return super.toString() + "Student [score=" + score + "]";
	}

}
