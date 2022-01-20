package com.zee.zee5_app.repository;

import com.zee.zee5_app.dto.Movie;

public interface MovieRepository {

	public String add(Movie movie);
	public String del(String id, Movie movies1);
	public String update(String id, Movie movie1);
	public Movie[] getAll();
	public Movie getById(String id);
}
