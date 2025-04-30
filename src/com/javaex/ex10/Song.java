package com.javaex.ex10;

public class Song {
	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//생성자
	//기본생성자
	public Song() {//메모리
		System.out.println("Song()");
	}
	
	
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	/*
	public Song(String title, String album) {
		this.title = title;
		this.album = album;
	}
	*/
	public Song(String title, int track) {
		this.title = title;
		this.track = track;
	}
	
	//생성자(5개)
	public Song(String artist, String title, String album, int year, String composer) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.year = year;
		this.composer = composer;
		System.out.println("Song(5)");
	}
	
	
	//생성자(6개)
	public Song(String artist, String title, String album, int year, int track, String composer) {
		//this(5)-->Song(5) 를 호출
		this(artist, title, album, year, composer); //메모리
		
		this.track = track; //일반적인 업무는 메모리에 올라간 후에 해야한다
		System.out.println("Song(6)");
	}
	
	
	//메소드 gs
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getArtist() {
		return artist;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getAlbum() {
		return album;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getComposer() {
		return composer;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	
	public void setTrack(int track) {
		this.track = track;
	}
	public int getTrack() {
		return track;
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println(artist + ", " + title+ " (" + album + ", " + year+ ", " +track + "번 track, " + composer + " 작곡)");
	}
	
}
