package com.javaex.ex10;

public class SongApp {

	public static void main(String[] args) {
		/*
		//기본메모리
		Song s1 = new Song();
		s1.setArtist("아이유");
		s1.setTitle("좋은날");
		s1.setAlbum("Real");
		s1.setYear(2010);
		s1.setTrack(3);
		s1.setComposer("이민수");
		
		s1.showInfo();
		System.out.println("--------------------");
		*/
		/*
		//생성자 5개
		Song s2 = new Song("BIGBANG", "거짓말", "Always", 2007, "G-DRAGON");
		s2.showInfo();
		
		
		System.out.println("--------------------");
		*/
		Song s3 = new Song("BIGBANG", "거짓말", "Always", 2007, 100, "G-DRAGON");
		s3.showInfo();
		
		/*
		Song("거짓말", "빅뱅");
		Song("거짓말", "always");
		Song(노래제목, 트랙);
		*/
	}

}
