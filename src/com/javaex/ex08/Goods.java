package com.javaex.ex08;

public class Goods {

	//필드
	private String name;
	private int price;
	
	
	
	//생성자
	public Goods() {//기본생성자-자동
					//다른생성자가 있으면 자동으로 생기지 않음.
		//메모리에 올리는 일(자동)
	}
	
	public Goods(String name, int price) {
		//메모리에 올리는 일(자동)
		this.name = name;
		this.price = price;
	}
	
	
	
	//메소드 gs
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(int p) {
		price = p;
	}
	public int getPrice() {
		return price;
	}
	
	
	//메소드 일반
	public void showInfo() {
		System.out.println("=========================");
		System.out.println("상품이름:" + "\"" + name + "\"" + ", " + " 가격:" + price);
		System.out.println("=========================");
	}
	
}
