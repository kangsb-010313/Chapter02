package com.javaex.ex13;

public class TV {

	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	
	
	//생성자
	public TV() {
		
	}
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
		System.out.println("Power(3)");
	}

	
	
	
	//메소드 gs
	public int getChannel(int channel) {
		return channel;
	}
	public int getVolume(int volume) {
		return volume;
	}
	public boolean getPower(boolean power) {
		return power;
	}

	public void setPower(boolean on) {
		power = on;
		if(power == false) {
			channel = 0;
			volume = 0;
		}
	}
	
	public void setChannel(int channel) { //채널 입력
		this.channel = channel;
	}
	public void setChannel(boolean up) { //채널 증감
		if(up = true) {
			channel++;
		}
	}
	
	public void setVolume(int volume) { //볼륨 입력
		this.volume = volume;
	}
	public void setVolume(boolean up) { //볼륨 증감
		if(up == false) {
			volume--;
		}
	}
	
	
	
	//메소드 일반
	public void status() {
		System.out.println("파워:" + power + " 채널:" + channel + " 볼륨:" + volume);
		
	}
	
	
}
