package com.perficient.techbootcampmax;

public class Movie {
	private String Title;
	private String Director;
	private String Release;
	
	public Movie() {
		this.Title = "In Bruges";
	}
	
	public String getTitle() {
		return this.Title;
	}
	
	public String getDirector() {
		return this.Director;
	}
	
	public void setDirector(String name) {
		this.Director = name;
	}
	
}
