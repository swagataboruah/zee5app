package com.zee.zee5_app;



//REGISTER
import com.zee.zee5_app.dto.Register;
import com.zee.zee5_app.repository.UserRepository;
import com.zee.zee5_app.service.UserService; // cuz main consumes userservice class

//SUBSCRIPTION
import com.zee.zee5_app.dto.Subscription;
import com.zee.zee5_app.repository.SubscriptionRepository;
import com.zee.zee5_app.service.SubscriptionService;

//MOVIE
import com.zee.zee5_app.dto.Movie;
import com.zee.zee5_app.repository.MovieRepository;
import com.zee.zee5_app.service.MovieService;

//SERIES
import com.zee.zee5_app.dto.Series;
import com.zee.zee5_app.repository.SeriesRepository;
import com.zee.zee5_app.service.SeriesService;

public class Main {
	
	public static void main(String[] args) {
		
		
		// creating the Register Object - ie. object/instance of class Register from dto 
		
		Register register = new Register(); // Right hand side is the created object
		// Register is the class name
		// register is the reference (location capable of holding the address of your object) which will be used to refer your object
		// new keyword is used to create the object in the heap memory area
		// Register() is a constructor (default constructor) - but is it IDC or EDC? it will be IDC if we didn't declare any constructor in Register else it will me EDC
		
		register.setfirstname("swagata");  // calling all the setter methods related to Register
		register.setlastname("boruah");
		register.setemail("swagata@gmail");
		register.setpassword("sw123");
		
		System.out.println(register);  // printing the reference
		// the output we get as a single line ie. single string 
		// so it means that whenever you call reference, it will call the toString() method
		// above and below commands are the same and give same output
		System.out.println(register.toString());
		
		//System.out.println(register.getEmail); // returns the Email variable of register object using get 
	
		
		
		
	    // creating the login object ie. obj/instance of class Login from dto
		
		
		// Main should consume service so we create a UserService object named service
		UserService service = UserService.getInstance();
		// Even if we call 100 times we will get only 1 object
		
		
		// So in above command getInstance provides the singleton object
		// and according to flow, main consumes service ie. main has singleton object of service 
		// same way service should consist of the singleton object of repository
		// how many ever times we call getInstance we get only 1 object
		
	
		
		// NOW MAIN CONSUMES METHODS OF REGISTER THROUGH UserService
		// for adding 
		for(int i=1;i<=20;i++) {
			
			Register register2 = new Register();
			register2.setId("swa00"+i);
			register2.setFirstName("swa"+i);
			register2.setLastName("bor"+i);
			register2.setPassword("swa12");
			String result = service.addUser(register2); // getting added via service
			System.out.println(result);
		}

	
	    // Main needs to consume addUser method --> it consumes through the service 
		String result = service.addUser(register);
		System.out.println(result);
	
		// Main consumes getUserById from UserRepo
		Register register2 = service.getUserById("AB1");
		System.out.println(register2!=null);
		
		
		// Main consumes the rest of the methods of UserRepo in same way
		
		
		// SUBSCRIPTION
		Subscription subscription = new Subscription();
		subscription.setSubType("annual");  // calling all the setter methods related to Register
		subscription.setSubStatus("ongoing");
		subscription.setSubPackCountry("India");
		subscription.setDateofSub("123");
		subscription.setSubPayMode("credit");
		subscription.setSubId("swag123");
		subscription.setAutoRenew("yes");
		subscription.setExpiryDate("234");
		System.out.println(subscription);
	
		// NOW MAIN CONSUMES METHODS OF SUBSCRIPTION THROUGH SubscriptionService
		//ADD
		String resultsub = service.addUser(subscription);
		System.out.println(resultsub);
		
		//GET USER BY ID
		Subscription subscription3 = service.getSubsById("AB1");
		System.out.println(subscription!=null);
		
		//GET ALL USER
		Subscription subscription4 = service.getAllSubs("AB1");
		System.out.println(subscription!=null);
		
		//DELETE
		String resultsub1 = service.delSubs(subscription);
		System.out.println(resultsub1);
		
		//UPDATE
		String result2 = service.updateSubs("12", subscription) {
		System.out.println(result2);   
	     }
		
		
		
		// MOVIE
		Movie movie = new Movie();
		movie.setName("marvel");  // calling all the setter methods related to Register
		movie.setCat("action");
		movie.setLang("english");
		movie.setDateOfRel("123");
		movie.setId("123");
		System.out.println(movie);
		
		
		// NOW MAIN CONSUMES METHODS OF MOVIE THROUGH MovieService
		        //ADD
				String resultsub = service.addUser(subscription);
				System.out.println(resultsub);
				
				//GET USER BY ID
				Subscription subscription3 = service.getSubsById("AB1");
				System.out.println(subscription!=null);
				
				//GET ALL USER
				Subscription subscription4 = service.getAllSubs("AB1");
				System.out.println(subscription!=null);
				
				//DELETE
				String resultsub1 = service.delSubs(subscription);
				System.out.println(resultsub1);
				
				//UPDATE
				String result2 = service.updateSubs("12", subscription) {
				System.out.println(result2);   
			     }
		
		//SERIES
				Series series = new Series();
				series.setName("marvel");  // calling all the setter methods related to Register
				series.setCat("action");
				series.setLang("english");
				series.setDateOfRel("123");
				series.setId("123");
				System.out.println(series);
				
		// NOW MAIN CONSUMES METHODS OF SERIES THROUGH SeriesService
				//ADD
				String resultsub = service.addUser(subscription);
				System.out.println(resultsub);
				
				//GET USER BY ID
				Subscription subscription3 = service.getSubsById("AB1");
				System.out.println(subscription!=null);
				
				//GET ALL USER
				Subscription subscription4 = service.getAllSubs("AB1");
				System.out.println(subscription!=null);
				
				//DELETE
				String resultsub1 = service.delSubs(subscription);
				System.out.println(resultsub1);
				
				//UPDATE
				String result2 = service.updateSubs("12", subscription) {
				System.out.println(result2);   
			     }
		
	
	
	}

}


// Day 1 - 05:13:00 -----> 
// In main we created object for 
// Register register = new Register() for dto
// UserService service = new UserService(); coz main consume service

// In service we created object for 
// private UserRepository repository = new UserRepository(); coz service consume repository

// In repository we created object for
// private Register[] register = new Register[10]; coz it consumes the database or array in this case which is of type Register


// So we can see that use of these objects us just to call the methods of the particular class
// can we do that using just 1 object instead of declaring more than cuz they perform same task only
// That's why we use Singleton Design Pattern 
// Singleton DP -> Gets only one object for the spefic type userservice, userrepo etc

// We should limit the creation of object to only 1 --? getInstance 

// So now instead of UserService service = new UserService()
// We can use UserService service = UserService.getInstance(); in main
// We can use UserRepository repository = UserRepository.getInstance(); in service