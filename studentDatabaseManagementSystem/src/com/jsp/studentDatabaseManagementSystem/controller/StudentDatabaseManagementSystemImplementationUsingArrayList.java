package com.jsp.studentDatabaseManagementSystem.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.jsp.studentDatabaseManagementSystem.model.Student;

public class StudentDatabaseManagementSystemImplementationUsingArrayList implements StudentDatabaseManagementSystem {

	ArrayList<Student> arrayList = new ArrayList<Student>();
	Scanner scanner = new Scanner(System.in);

	@Override
	public void addStudent() {
		System.out.println("ENTER STUDENT NAME : ");
		String sName = scanner.nextLine();
		System.out.println("ENTER STUDENT AGE : ");
		int sAge = scanner.nextInt();
		System.out.println("ENTER STUDENT MARKS : ");
		double sMarks = scanner.nextDouble();
		Student student = new Student(sName, sAge, sMarks);
		arrayList.add(student);
		System.out.println("SUCCESSFULLY STUDENT DATA IS ADDED WITH THE ID :" + student.getStudentId());
	}

	@Override
	public void searchStudent() {
		System.out.println("ENTER STUDENT ID TO SEARCH :");
		int sId = scanner.nextInt();
		for (Student student : arrayList) {
			if (student.getStudentId() == sId) {
				System.out.println(student);
			} else {
				System.out.println("STUDENT NOT FOUND PLEASE ENTER CORRECT STUDENTID");
			}
		}
	}

	@Override
	public void displayAllStudents() {
		for (Student student : arrayList) {
			System.out.println(student);
		}
	}

	@Override
	public void removeStudent() {
		System.out.println("ENTER STUDENT ID TO SEARCH :");
		int sId = scanner.nextInt();
		int var=0;
		for (Student student : arrayList) {
			if (student.getStudentId() == sId) {
				arrayList.remove(student);
				System.out.println(sId + " NUMBER STUDENT DELETED SUCCESSFULLY FROM THE LIST");
				var++;
				break;
			}
		}
		if(var==0)System.out.println("STUDENT NOT FOUNT IN LIST WITH THE ID " + sId+" IS PRESENT IN THE LIST PLEASE ENTER CORRECT STUDENT ID");

	
	}

	@Override
	public void countStudent() {
		if (arrayList.isEmpty())
			System.out.println("NO STUDENTS ARE PRESENT IN THE LIST");
		System.out.println(arrayList.size());
	}

	@Override
	public void sortStudent() {
         
	}

	@Override
	public void updateStudentMarks() {
		System.out.println("ENTER STUDENT ID TO WHICH YOU WANT TO UPDATE MARKS ");
		int sId = scanner.nextInt();
		System.out.println("ENTER NEW MARKS TO  ");
		double newMarks = scanner.nextDouble();
		for (Student student : arrayList) {
			if (student.getStudentId() == sId) {
				student.setStudentMarks(newMarks);
				System.out.println(sId + " NUMBER STUDENT'S MARKS UPDATED SUCCESSFULLY");
			}
		}
		System.out.println("STUDENT NOT FOUNT IN LIST WITH THE ID " + sId
				+ " IS PRESENT IN THE LIST PLEASE ENTER CORRECT STUDENT ID");
	}
}
