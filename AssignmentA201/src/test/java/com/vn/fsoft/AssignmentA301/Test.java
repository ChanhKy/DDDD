package com.vn.fsoft.AssignmentA301;

import static org.junit.Assert.assertTrue;

import trainging.entities.Movie;
import training.dao.MovieDAOImpl;

public class Test {

	MovieDAOImpl dao = new MovieDAOImpl();
	@org.junit.Test
	public void test1() {
		assertTrue(true);
	}
	
	@org.junit.Test
	public void test2() {
		assertTrue(dao.insertMovie(null));
	}
	
	public void test3(Movie movie) {
		assertTrue(dao.updateMovieById(movie));
	}
}
