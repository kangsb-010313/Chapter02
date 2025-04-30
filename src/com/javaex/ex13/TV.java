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
	}
	public TV(boolean power, int volume) {
		this.power = power;
		this.volume = volume;
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
		if(on == true) {
			this.power = true;
		}else {
			this.power = false;
		}
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public void setChannel(boolean up) {
		
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void setVolume(boolean up) {

	}
	
	
	
	//메소드 일반
	public void status() {
		System.out.println("파워:" + power + " 채널:" + channel + " 볼륨:" + volume);
		
	}
	
	
}
