package com.zee.zee5_app.service;

import com.zee.zee5_app.dto.Movie;
import com.zee.zee5_app.dto.Subscription;
import com.zee.zee5_app.repository.MovieRepository;
import com.zee.zee5_app.repository.SubscriptionRepository;

public class MovieService {
	private MovieRepository repository1 = MovieRepository.getInstance();
	private MovieService() {
		// TODO Auto-generated constructor stub
	}
		
	private static MovieService service = null; 
	public static MovieService getInstance() {
				
			if(service==null)
				service = new MovieService();
			return service; 		
	}
	
	// CONSUMING GET ALL SUBSCRIPTION FROM MovieRepository
	public Movie[] getAll() {
		return this.repository1.getAll();
	}


	// CONSUMING GET SUBSCRIPTION BY ID FROM MovieRepository
	 public Movie getById(String id) {
     	return this.repository1.getById(id);
     }
     
	// CONSUMING ADD SUBSCRIPTION FROM MovieRepository
     public String add(Movie movie) {
	    return this.repository1.add(movie);
     }

   // CONSUMING DELETE SUBSCRIPTION FROM UserRepository
     public String del(String id, Movie movie1) {
    	 return this.repository1.del(id, movie1);
     }
     
   // CONSUMING UPDATE SUBSCRIPTION FROM MovieRepository
     public String update(String id, Movie movie1) {
     return this.repository1.update(id, movie1);
     }
}
