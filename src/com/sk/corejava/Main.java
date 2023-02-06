package com.sk.corejava;

public class Main {
	static Student stu;
	static Student stu1;

	public static void main(String[] args) {

		Student s =new Student();
		
		/*
		 * s.no = 1; s.name = "sk"; s.sal = 1.2f;
		 */
		stu = s;
		if(stu1==null) {
			stu1=stu;
		}
		stu1.no = 2;
		System.out.println(stu1);
		System.out.println(stu);
		System.out.println(s);
	}
}

class Student {
	int no;
	String name;
	float sal;
}