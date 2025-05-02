package com.javaex.ex17;

public class PointApp {

	public static void main(String[] args) {

		/*
		5, 5
		10, 10
		20, 20
		
		배열에 넣고
		
		draw()로 그리시오 (for문)
		*/

		Point[] point = new Point[3];
		
		Point p01 = new Point(5, 5);
		Point p02 = new Point(10, 10);
		Point p03 = new Point(20, 20);
		
		/*
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		System.out.println(p03.toString());
		*/
		
		point[0] = p01; //배열에 !주소!를 대입
		point[1] = p02; //배열에 !주소!를 대입
		point[2] = p03; //배열에 !주소!를 대입
		
		/*
		System.out.println(point[0].toString());
		System.out.println(point[1].toString());
		System.out.println(point[2].toString());
		*/
		 
		for(int i=0; i<point.length; i++) {
			System.out.println(point[i].toString());
			
			//point[i].draw();
		}
	
	
	
	
	
	}

}
