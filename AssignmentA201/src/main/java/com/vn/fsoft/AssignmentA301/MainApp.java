package com.vn.fsoft.AssignmentA301;

import java.util.Date;
import java.util.List;

import trainging.entities.Movie;
import trainging.entities.Type;
import training.dao.MovieDAOImpl;
import training.dao.MovieTypeDAOImpl;
import training.dao.TypeDAOImpl;

/**
 * Hello world!
 *
 */
public class MainApp {
	public static void main(String[] args) {
		System.out.println("Hello Hibernate");
		TypeDAOImpl typeDaoImpl = new TypeDAOImpl();
		MovieTypeDAOImpl movieDaoImpl = new MovieTypeDAOImpl();
		MovieDAOImpl movieDao = new MovieDAOImpl();

		List<Movie> movies = null;

//		Type type1 = new Type("Hanh Dong", "Danh nhau");
//		typeDaoImpl.insertType(type1);
//		

		Movie m1 = new Movie("MV001", "ABC", "Phim te", "Ky", 90, new Date("28/12/1998"), new Date("29/12/1999"), "VTV",
				"1.0", "NO", "YES", "YES", "NO", null);
//		movieDao.insertMovie(m1);

//		movies = movieDao.getAllMovie();
//		for (Movie movie : movies) {
//		System.out.println(movie);
//		}
//		

//		movies = movieDao.getMovieById(1);
//		for (Movie movie : movies) {
//		System.out.println(movie);
//		}

		boolean count = movieDao.updateMovieById(m1);
		System.out.println(count);

		System.out.println("THE ENDDDDDDDDD");
	}
}
