package com.javaex.ex18;

public class PersonApp {

	public static void main(String[] args) {

		Student s01 = new Student("황선우", 23, "서울체육고등학교");
		Student s02 = new Student("강수빈", 25, "휘경여자고등학교");
		
		System.out.println(s01.toString());
		System.out.println(s02.toString());

	}

}
