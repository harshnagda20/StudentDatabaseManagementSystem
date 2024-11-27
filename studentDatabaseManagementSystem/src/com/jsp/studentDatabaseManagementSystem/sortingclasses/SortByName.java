package com.jsp.studentDatabaseManagementSystem.sortingclasses;

import java.util.Comparator;

import com.jsp.studentDatabaseManagementSystem.model.Student;

public class SortByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getStudenrName().compareTo(o2.getStudenrName());
	}

}
