package training.dao;

import java.util.List;

import trainging.entities.Movie;

public interface MovieDAO {

	public boolean insertMovie(Movie movie);
	
	public List<Movie> getAllMovie();
	
	public List<Movie> getMovieById(int id);
	
	public boolean updateMovieById(Movie movie);
	
}
