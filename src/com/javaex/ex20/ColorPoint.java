package com.javaex.ex20;

public class ColorPoint extends Point{

	//필드
	private String color;

	
	//생성자
	public ColorPoint() {
		System.out.println("ColorPoint()");
	}	
	public ColorPoint(String color) {
		this.color = color;
		System.out.println("ColorPoint(1)");
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
		System.out.println("ColorPoint(3)");
		
		//*초기화2 - 부모의 필드에 직접 입력X setter이용
		//super.setX(x); 
		//super.setY(y);
		//this.color = color;
		
		//*초기화3 - 부모의 필드가 protected일 때
		//super.x = x;
		//super.y = y;
		//this.color = color;
	}


	
	//메소드 gs
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

	//메소드 일반
//	@Override
//	public String toString() {
//		return "점 x= " + x + ", y=" + y + ", ColorPoint [color=" + color + "]";
//		
//	}
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + ", x=" + x + ", y=" + y + "]";
	}
	public void showInfo() {
		System.out.println("==========================");
		System.out.println("점 x=" + x + ", y=" + y + ", color=" + color);
		System.out.println("==========================");
		
		/*
		System.out.println("==========================");
		System.out.println("x=" + super.getX());
		System.out.println("x=" + super.getY());
		System.out.println("==========================");
		*/
	}
	
}
