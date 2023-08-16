package com.tnsif.core;

 class Student {
	String name;
	int age;
	int roll_number;
	

	}

 class Sample
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.name="Nagalakshmi";
		s1.age=20;
		s1.roll_number=25;
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.roll_number);
	}
}
