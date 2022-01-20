package com.zee.zee5_app.repository;

import com.zee.zee5_app.dto.Series;

public interface SeriesRepository {

	public String add(Series series);
	public String del(String id, Series series2);
	public String update(String id, Series series2);
	public Series[] getAll();
	public Series getById(String id);
	
}
