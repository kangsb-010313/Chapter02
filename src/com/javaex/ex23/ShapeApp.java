package com.javaex.ex23;

public class ShapeApp {

	public static void main(String[] args) {
		
		/*
		Triangle t01 = new Triangle("빨강", "주황", 13, 13);
		//System.out.println(t01.toString());
		t01.draw();
		
		Rectangle r01 = new Rectangle("노랑", "초록", 15, 15);
		//System.out.println(r01.toString());
		r01.draw();
		
		Circle c01 = new Circle("파랑", "남색", 3);
		//System.out.println(c01.toString());
		c01.draw();
		*/
		
		Shape[] sArray = new Shape[3];
		
		Shape st = new Triangle("빨강", "주황", 13, 13);
		Shape sr = new Rectangle("노랑", "초록", 15, 15);
		Shape sc = new Circle("파랑", "남색", 3);
		
		sArray[0] = st;
		sArray[1] = sr;
		sArray[2] = sc;
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		
		
		
		
		
	}
	
}
