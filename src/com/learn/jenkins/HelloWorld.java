package com.learn.jenkins;

public class HelloWorld {
	
	class Student{
		
		public void Student() {
			
			System.out.println("Student Constructor calling...");
		}
		
		public void sayHello() {
			
			System.out.println("Hi, I am student...");
			
			Student student = new Student();
			student.sayHello();
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Hello World Jenkins.");
		
	}
}
