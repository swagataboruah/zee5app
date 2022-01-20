package com.zee.zee5_app.repository;
import com.zee.zee5_app.dto.Movie;
import com.zee.zee5_app.dto.Subscription;

public class MovieRepository {
	    //ADD NEW
		private Movie[] movies = new Movie[10];
		private MovieRepository() {
			
		}
		private static int count=-1;
		public String add(Movie movie) {
			if(count==movies.length-1) {
				Movie temp[] = new Movie[movies.length*2];
				System.arraycopy(movie, 0, temp, 0, movies.length);
				movies = temp;
				movies[++count] = movie; 
				return "Movie added";
			}
			movies[++count] = movie;
			return "Movie added";
		}
		
		
		//DELETE
		public String del(String id, Movie movies1) {
			Movie temp[] = new Movie[movies.length-1];
			for(Movie movie : movies) {
				if(movies1.!= id) {
					System.arraycopy(movie, 0, temp, 0, movies.length-1);
				}
			
			}
		}
		
		
		//UPDATE
		public String update(String id, Movie movie1) {
			int count1 = 0;
			for(Movie movie : movies) {
				if(movie!=null && movie.getId().equals(id)) {
					movies[count1] = movie1;
					return("updated");
				}
			}
			count1++;
		}
		
		
		//GET ALL
		public Movie[] getAll() {
			return movies;
		}
		
		
		//GET ALL BY ID
		public Movie getById(String id) {
			for (Movie movie : movies) {
				if(movies!=null && movie.getId().equals(Id) ) {
					return movie;
				}
			}
			return null;		
		}
		
		
		
		private static MovieRepository subscriptionRepository;
		public static MovieRepository getInstance() {
			if(movieRepository==null)
				movieRepository = new MovieRepository();
			return movieRepository; 
		}
		
}
