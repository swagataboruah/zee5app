package com.zee.zee5_app.service;

import com.zee.zee5_app.dto.Series;

import com.zee.zee5_app.repository.SeriesRepository;


public class SeriesService {
	
		private SeriesRepository repository1 = SeriesRepository.getInstance();
		private SeriesService() {
			// TODO Auto-generated constructor stub
		}
			
		private static SeriesService service = null; 
		public static SeriesService getInstance() {
					
				if(service==null)
					service = new SeriesService();
				return service; 		
		}
		
		// CONSUMING GET ALL SUBSCRIPTION FROM SeriesRepository
		public Series[] getAll() {
			return this.repository1.getAll();
		}


		// CONSUMING GET SUBSCRIPTION BY ID FROM SeriesRepository
		 public Series getById(String id) {
	     	return this.repository1.getById(id);
	     }
	     
		// CONSUMING ADD SUBSCRIPTION FROM SeriesRepository
	     public String add(Series series) {
		    return this.repository1.add(series);
	     }

	   // CONSUMING DELETE SUBSCRIPTION FROM SeriesRepository
	     public String del(String id, Series series1) {
	    	 return this.repository1.del(id, series1);
	     }
	     
	   // CONSUMING UPDATE SUBSCRIPTION FROM SeriesRepository
	     public String update(String id, Series series1) {
	     return this.repository1.update(id, series1);
	     }
		
}
