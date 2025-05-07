package com.javaex.ex20;

public class PointApp {

	public static void main(String[] args) {

		Point p = new Point(4, 7);
		
		ColorPoint cp1 = new ColorPoint("red");
		cp1.setX(4);
		cp1.setY(4);
		cp1.showInfo();
		
		ColorPoint cp2 = new ColorPoint(10, 10, "blue");
		cp2.showInfo();
		
		/*
		System.out.println(p.toString());
		System.out.println("------------------------------");
		
		System.out.println(cp1.toString());
		System.out.println(cp2.toString());
		*/
	}
	
}
