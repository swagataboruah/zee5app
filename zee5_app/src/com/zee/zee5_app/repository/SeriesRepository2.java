package com.zee.zee5_app.repository;

import com.zee.zee5_app.dto.Series;

public class SeriesRepository2 {
    //ADD NEW
	private Series[] series1 = new Series[10];
	private SeriesRepository() {
		
	}
	private static int count=-1;
	public String add(Series series) {
		if(count==series1.length-1) {
			Series temp[] = new Series[series1.length*2];
			System.arraycopy(series, 0, temp, 0, series1.length);
			series1 = temp;
			series1[++count] = series; 
			return "Series added";
		}
		series1[++count] = series;
		return "Series added";
	}
	
	
	//DELETE
	public String del(String id, Series series2) {
		Series temp[] = new Series[series1.length-1];
		for(Series series : series1) {
			if(series1 != id) {
				System.arraycopy(series, 0, temp, 0, series1.length-1);
			}
		
		}
	}
	
	
	//UPDATE
	public String update(String id, Series series2) {
		int count1 = 0;
		for(Series series : series1) {
			if(series1!=null && series1.getId().equals(id)) {
				series1[count1] = series2;
				return("updated");
			}
		}
		count1++;
	}
	
	
	//GET ALL
	public Series[] getAll() {
		return series1;
	}
	
	
	//GET ALL BY ID
	public Series getById(String id) {
		for (Series series : series1) {
			if(series1!=null && series1.getId().equals(Id) ) {
				return series;
			}
		}
		return null;		
	}
	
	
	
	private static SeriesRepository seriesRepository;
	public static SeriesRepository getInstance() {
		if(seriesRepository==null)
			seriesRepository = new SeriesRepository();
		return seriesRepository; 
	}
}
