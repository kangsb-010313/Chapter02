package com.javaex.ex05;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자
	
	
	//메소드
	//name 등록
	public void setName(String name) {
		this.name = name;
	}
	//name 읽어오기
	public String getName() {
		return name;
	}
	
	//price 등록
	public void setPrice(int price) {
		this.price = price;
	}
	//price 읽어오기
	public int getPrice() {
		return price;
	}
	
	//정보 출력
	public void showInfo() {
		System.out.println("=====================");
		System.out.println("이름: " + this.name);
		System.out.println("가격: " + this.price);
		System.out.println("=====================");
	}
	
	
	
}
