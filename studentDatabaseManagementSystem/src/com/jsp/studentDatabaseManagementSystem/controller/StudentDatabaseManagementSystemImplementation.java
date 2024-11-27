package com.jsp.studentDatabaseManagementSystem.controller;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.jsp.studentDatabaseManagementSystem.customeexception.StudentNotFound;
import com.jsp.studentDatabaseManagementSystem.model.Student;
import com.jsp.studentDatabaseManagementSystem.sortingclasses.SortByName;

public class StudentDatabaseManagementSystemImplementation implements StudentDatabaseManagementSystem {

	// Database
	LinkedHashMap<Integer, Student> db = new LinkedHashMap<Integer, Student>();
	Scanner scanner = new Scanner(System.in);

	@Override
	public void addStudent() {
		System.out.println("ENTER STUDENT NAME");
		String name = scanner.nextLine();
		System.out.println("ENTER STUDENT AGE");
		int age = scanner.nextInt();
		System.out.println("ENTER STUDENT MARKS");
		double marks = scanner.nextDouble();
		Student student = new Student(name, age, marks);
		// Storing student inside DB
		db.put(student.getStudentId(), student);
		System.out.println("STUDENT DATA ADDEED SUCCESSFULLY");
	}

	@Override
	public void searchStudent() {
		System.out.println("ENTER STUDENT SID");
		int sid = scanner.nextInt();
		if (db.containsKey(sid)) {
			Student student = db.get(sid);
			System.out.println(student);
		} else {
			// Custom exception
			throw new StudentNotFound();
		}
	}

	@Override
	public void displayAllStudents() {
		Set<Integer> set = db.keySet();
		if (set.isEmpty())
			System.out.println("NO STUDENTS DATA PRESENT");
		for (Integer elements : set) {
			System.out.println(db.get(elements));
		}
	}

	@Override
	public void removeStudent() {
		System.out.println("ENTER STUDENT'S SID");
		int sid = scanner.nextInt();
		if (db.containsKey(sid)) {
			System.out.println(db.get(sid));
			System.out.println("DO YOU WANT TO REMOVE THE STUDENT");
			System.out.println("1.YES\n2.NO");
			int choice = scanner.nextInt();
			if (choice == 1) {
				db.remove(sid);
				System.out.println("STUDENT DATA REMOVED SUCCESSFULLY");
			} else {
				System.out.println("STUDENT DATA NOT REMOVED");
			}
		} else {
			System.out.println("STUDENT NOT FOUND");
		}

	}

	@Override
	public void countStudent() {
		System.out.println("THE TOTAL NUMBER OF STUDENTS ARE: " + db.size());
	}

	@Override
	public void sortStudent() {
		TreeSet<Student> treeSet = new TreeSet<Student>(new SortByName());
		Set<Integer> set = db.keySet();
		for (Integer elements : set) {
			treeSet.add(db.get(elements));
		}
		for (Student elements : treeSet) {
			System.out.println(elements);
		}
	}

	@Override
	public void updateStudentMarks() {
		System.out.println("Enter SID");
		int sid = scanner.nextInt();

		if (db.containsKey(sid)) {
			Student student = db.get(sid);
			System.out.println("OLD MARKS OF THE STUDENT ARE :" + student.getStudentMarks());
			System.out.println("ENTER NEW MARKS");
			double marks = scanner.nextDouble();
			student.setStudentMarks(marks);
			System.out.println("MARKS ARE UPDATED AS" + student.getStudentMarks());
			System.out.println(student);
		} else {
			throw new StudentNotFound();
		}
	}
}
