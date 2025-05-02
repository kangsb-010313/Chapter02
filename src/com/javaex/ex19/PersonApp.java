package com.javaex.ex19;

public class PersonApp {

	public static void main(String[] args) {
		/*
		//학생의 개념 --> 이름 나이   학교이름
		//수정 전 --> Student 에 extends Person 지우고 테스트
		//Student 가 Person 을 상속받기 전
		Student s01 = new Student();
		s01.setSchoolName("서울체육고등학교");
		//이름, 나이 x
		*/
		
		//Student 가 Person 을 상속받은 후
		Student s02 = new Student();
		s02.setSchoolName("서울체육고등학교");
		s02.setName("황선우");
		s02.setAge(23);
		
		System.out.println("------------------");
		//이렇게 쓰는 게 젤 자연스러움
		Student s03 = new Student("최우식", 36, "파인트리고등학교");
		// Person(2) --> Student(3)
		
		System.out.println(s03.getSchoolName());
		System.out.println(s03.getName());
		System.out.println(s03.getAge());
		s03.showInfo();
		
		System.out.println("--------------------------");
		System.out.println(s03.toString());
	}

}
