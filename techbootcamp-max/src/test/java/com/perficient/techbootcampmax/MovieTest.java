package com.perficient.techbootcampmax;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class MovieTest {
	
	Movie testMovie;
	Movie mockMovie = mock(Movie.class);
	
	@BeforeEach
	void setUp() {
		testMovie = new Movie();
	}
	
	@Test
	void mockTest() {
		when(mockMovie.getTitle()).thenReturn("In Bruges");
		assertEquals(mockMovie.getTitle(), testMovie.getTitle());
	}
	
	@Test
	void emptyConTest() {
		assertEquals("In Bruges", testMovie.getTitle());
	}
	
	@Test
	void setTitleTest() {
		testMovie.setTitle("Sicario");
		assertEquals("Sicario", testMovie.getTitle());
	}
	
	@Test
	void setDirTest() {
		testMovie.setDirector("Martin McDonaugh");
		assertEquals("Martin McDonaugh", testMovie.getDirector());
	}
}
