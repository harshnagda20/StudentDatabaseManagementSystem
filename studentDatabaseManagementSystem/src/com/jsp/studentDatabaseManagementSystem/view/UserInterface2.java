package com.jsp.studentDatabaseManagementSystem.view;

import java.util.Scanner;

import com.jsp.studentDatabaseManagementSystem.controller.StudentDatabaseManagementSystem;
import com.jsp.studentDatabaseManagementSystem.controller.StudentDatabaseManagementSystemImplementationUsingArrayList;

public class UserInterface2 {

	public static void main(String[] args) {
		StudentDatabaseManagementSystem studentDatabaseManagementSystem = new StudentDatabaseManagementSystemImplementationUsingArrayList();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcom to OUR STUDENT DATABASE MANAGEMENT SYSTEM");
		boolean flag = true;
		while (flag) {
			System.out.println("1.ADD STUDENTS");
			System.out.println("2.SEARCH STUDENTS");
			System.out.println("3.DISPLAY ALL STUDENTS");
			System.out.println("4.REMOVE STUDENTS");
			System.out.println("5.COUNT STUDENTS");
			System.out.println("6.UPDATE STUDENT MARKS");
			System.out.println("7.EXIT");
			System.out.println("ENTER YOUR CHOICE");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				studentDatabaseManagementSystem.addStudent();
			}
				break;
			case 2: {
				studentDatabaseManagementSystem.searchStudent();
			}
				break;
			case 3: {
				studentDatabaseManagementSystem.displayAllStudents();
			}
				break;
			case 4: {
				studentDatabaseManagementSystem.removeStudent();
			}
				break;
			case 5: {
				studentDatabaseManagementSystem.countStudent();
			}
				break;
			case 6: {
				studentDatabaseManagementSystem.updateStudentMarks();
			}
				break;
			case 7: {
				flag = false;
				System.out.println("THANK YOU");
			}
				break;

			default: {
				System.out.println("ENTER VALID CHOICE PLEASE");
			}
			}
		}
		scanner.close();
	}
}
