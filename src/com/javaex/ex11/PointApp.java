package com.javaex.ex11;

public class PointApp {

	public static void main(String[] args) {

		Point p01 = new Point();
		
		p01.setX(5);
		p01.setY(5);
		p01.draw();
		
		Point p02 = new Point(10, 23);
		p02.draw();
		
		System.out.println("===================");
		p01.draw(); //그림

		p01.draw(true); //그림
		p01.draw(false); //지움

	
	}

}
