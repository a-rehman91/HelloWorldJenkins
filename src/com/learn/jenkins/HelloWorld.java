package com.learn.jenkins;

class Student{
	
	public void Student() {
		
		System.out.println("Student Constructor calling...");
	}
	
	public void sayHello() {
		
		System.out.println("Hi, I am student...");
		
	}
}

public class HelloWorld {
	

	public static void main(String[] args) {
		
		System.out.println("Hello World Jenkins.");
		
		Student student = new Student();
		student.sayHello();
	}
}
