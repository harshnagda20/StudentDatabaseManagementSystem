package com.jsp.studentDatabaseManagementSystem.model;

public class Student {
	private String studenrName;
	private int studentId;
	private int studentAge;
	private double studentMarks;
	static int id = 1;

	public Student(String studenrName, int studentAge, double studentMarks) {
		super();
		this.studenrName = studenrName;
		this.studentAge = studentAge;
		this.studentMarks = studentMarks;
		studentId = id;
		id++;
	}

	public String getStudenrName() {
		return studenrName;
	}

	public void setStudenrName(String studenrName) {
		this.studenrName = studenrName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public double getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(double studentMarks) {
		this.studentMarks = studentMarks;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Student.id = id;
	}

	
	@Override
	public String toString() {
		return "Student [studenrName=" + studenrName + ", studentId=" + studentId + ", studentAge=" + studentAge
				+ ", studentMarks=" + studentMarks + "]";
	}

	@Override
	public boolean equals(Object o) {
		Student s = (Student) o;
		return this.studentId == s.studentId;
	}

	@Override
	public int hashCode() {
		return studentId;
	}

}
