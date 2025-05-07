package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {

		Triangle t01 = new Triangle("주황", "검정", 13, 17);
		// System.out.println(t01.toString());
		t01.draw();
		
		Rectangle r01 = new Rectangle("파랑", "노랑", 15, 20);
		// System.out.println(r01.toString());
		r01.draw();
		
		Circle c01 = new Circle("초록", "보라", 33);
		// System.out.println(c01.toString());
		c01.draw();
	}

}
