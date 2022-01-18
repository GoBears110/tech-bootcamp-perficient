package com.perficient.techbootcampmax;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MovieTest {
	@Test
	void getTitleTest() {
		Movie m = new Movie();
		assertEquals("In Bruges", m.getTitle());
	}
	
	@Test
	void setTitleTest() {
		Movie m = new Movie();
		m.setDirector("Martin McDonaugh");
		assertEquals("Martin McDonaugh", m.getDirector());
	}
}
