package com.javaex.ex14;

public class Goods {

	// 필드
	private String name;
	private int price;
	private static int count;

	// 생성자
	public Goods() {
		// 메모리
		count = count + 1; // count++   ++count
	}

	public Goods(String name, int price) {
		// 메모리
		this.name = name;
		this.price = price;
		count = count + 1; // count++   ++count
	}

	// 메소드 gs
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public int getCount() {
		return count;
	}


	// 메소드 일반
	public void showInfo() {
		System.out.println("상품이름:" + name + " 가격:" + price);
		System.out.println("--------------------------");
	}

}
