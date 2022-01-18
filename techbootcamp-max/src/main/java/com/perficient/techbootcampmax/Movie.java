package com.perficient.techbootcampmax;

public class Movie {
	private String Title;
	private String Director;
	
	public Movie() {
		this.Title = "In Bruges";
		this.Director = "Martin McDonaugh";
	}
	
	public Movie(String title, String director) {
		this.Title = title;
		this.Director = director;
	}
	
	public String getTitle() {
		return this.Title;
	}
	
	public String getDirector() {
		return this.Director;
	}
	
	public void setTitle(String movieName) {
		this.Title = movieName;
	}
	
	public void setDirector(String directorName) {
		this.Director = directorName;
	}
	
}
