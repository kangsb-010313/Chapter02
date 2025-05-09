package com.javaex.ex25;

import java.util.Scanner;

public class Ex01 {
	//필드
	
	//생성자
	
	//메소드 gs
	
	//메소드 일반

	public static void main(String[] args) {

		//Point p01 = new Point(3, 3);
		//p01.draw();
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = 0;
		
		//try catch문
		try {
			result = 100/num;	
			
		}catch(ArithmeticException e) { //e(정해준 이름) == error 줄임말로 많이 씀 
			//System.out.println(e.toString());
			System.out.println("0으로 나눌 수 없습니다.");
		}finally {
			System.out.println("공통영역");
		}
		
		
		System.out.println(result);
		
		sc.close();
	
		
		
		
	}

}
