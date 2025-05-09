package com.javaex.ex26;

import java.io.IOException;

//구글
//하드 디스크에 있는 파일을 읽어오는 클래스
public class MyFile {
	
	//필드
	
	
	//생성자
	/*
	public MyFile() {
		//기본 생성자
		//생략 가능
	}
	*/
	
	
	//메소드 gs 
	
	
	//메소드 일반
	public String read(String path) {
		//path 의 파일을 찾는다 ex) C:\javaStudy\java\노래.txt
		//파일의 내용을 읽어서 변수에 담는다
		String result = "학교종이 땡땡땡 어서모이자";
		
		return result;
	}
	
	
	//파일이 없어서 못 읽었을 때 예외처리까지 진행
	public String read2(String path) {
		//path 의 파일을 찾는다 ex) C:\javaStudy\java\노래.txt
		//파일의 내용을 읽어서 변수에 담는다
		//정상적이면 리턴
		
		
		//*파일이 없는 경우
		try {
			//path 의 파일을 찾는다 ex) C:\javaStudy\java\노래.txt
			//파일의 내용을 읽어서 변수에 담는다
			//정상적이면 리턴
			throw new IOException(); // 파일이 없는 상황을 강제로 만듦
			//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			//예외발생 (파일이 없음)

			
		} catch (Exception e) {
			System.out.println("no file");
		}
		
		return "";
	}
	
	
	//파일이 없어서 못 읽었을 때 예외처리를 하지 않음-->알려만 준다
	public void read3(String path) throws IOException{
		

		throw new IOException(); // 파일이 없는 상황을 강제로 만듦
		
	
		
			
	}
	

}
