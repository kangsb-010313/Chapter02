package com.javaex.ex13;

public class TVApp {

	public static void main(String[] args) {
		
		TV tv = new TV(7, 20, false);
		tv.status();
		System.out.println("---------------------");
		
		TV tv2 = new TV(true, 120);
		tv2.status();
		System.out.println("---------------------");
		
		
		
		
	}

}
