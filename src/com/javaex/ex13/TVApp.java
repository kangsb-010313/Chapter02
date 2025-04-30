package com.javaex.ex13;

public class TVApp {

	public static void main(String[] args) {
		
		TV tv = new TV(7, 20, false);
		
		tv.status(); // 파워 false 채널 7 볼륨 20
		System.out.println("--------------------------");
		
		tv.setPower(true); //파워 true
		tv.setVolume(120); //볼륨 100
		tv.status(); // 파워 true 채널 7 볼륨 100
		System.out.println("--------------------------");
		
		tv.setVolume(false);//볼륨 증감
		tv.status(); // 파워 true 채널 7 볼륨 99
		System.out.println("--------------------------");
		
		tv.setChannel(0); //채널 증감
		tv.status(); //파워 true 채널 1? 볼륨 
		System.out.println("--------------------------");
		
		//채널 증가?, 볼륨 증감
		tv.setChannel(true); //파워 true 채널 + 볼륨 
		tv.setChannel(true); //파워 true 채널 + 볼륨 
		tv.setChannel(true); //파워 true 채널 3 볼륨 
		tv.status(); 
		System.out.println("--------------------------");
		
		tv.setPower(false); //파워 false 채널 0 볼륨 0
		tv.status();
	}

}
