package com.javaex.ex19;

public class Student extends Person{

	//필드
	private String schoolName;
	
	
	//생성자
	public Student() {
		System.out.println("Student()");
	}
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	//////////////////////////////////////
	public Student(String name, int age, String schoolName) {
		//name
		//age
		super(name, age); //Person의 파라미터(2) 생성자 실행
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	//////////////////////////////////////

	
	//메소드 gs
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	public void showInfo() {
		System.out.println("=========================");
		System.out.println("이름: " + super.getName());	//부모 쪽 private
		System.out.println("나이: " + age); 				//부모 쪽 protected
		System.out.println("학교: " + this.schoolName);	//자신
		System.out.println("=========================");
	}
	
	
	
}
