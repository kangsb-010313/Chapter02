package com.javaex.ex24;

public abstract class Shape {

	//필드
	protected String fillColor;
	protected String lineColor;
	
	
	//생성자
	public Shape() {

	}
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	
	//메소드 gs
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	/*
	public void draw() {
		//코드 쓸 게 없어서 억지로 쓴 코드
		System.out.println("draw()");
	}
	*/
	
	//인터페이스가 draw개념을 가지고 있음
	//public abstract void draw();
	
	public abstract void area();
}
