package com.javaex.ex23;

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
	
	//코드는 작성하고 싶어도 못한다 --> 안만들면 됨
	//그러나 필요는 함 --> 자식들이 만들어야 한다(자식에 없으면 오류)
	//오버라이딩 용 메소드 작성 - 메소드 껍데기만 만들기
	//abstract 사용하여 내부코드 없어도 되게 한다
	//abstract 를 사용한 메소드는 자식이 꼭 구현해야함
	public abstract void draw(); //내용 안 써도 됨 (오버라이딩 용 메소드)
	public abstract void area();
}
