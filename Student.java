package org.student;

import org.college.College;

public class Student extends College {
	public void studentName() {
		System.out.println("student name");
	}
	public void studentDept() {
		System.out.println("student department");
	}
public void studentId() {
	System.out.println("student id");
}
public static void main(String[] args) {
	Student obj=new Student();
	obj.studentName();
	obj.studentDept();
	obj.studentId();
	obj.collegeName();
	obj.collegeCode();
	obj.collegeRank();
	obj.deptName();
}
}
