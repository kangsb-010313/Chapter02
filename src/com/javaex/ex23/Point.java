package com.javaex.ex23;

public class Point extends Shape{

	//부모의 fillColor, lineColor 없어야 됨. Shape 상속할 필요 없음
	//같은 배열에 들어가야 돼서 Shape을 상속 받음
	
	//필드
	private int x;
	private int y;

	
	//생성자
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	//메소드 gs
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}	
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public void draw() {
		System.out.println("========점을 찍었습니다========");
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		System.out.println("===========================");
	}
	public void area() {
		System.out.println("면적을 구할 수 없습니다");
	}
}
