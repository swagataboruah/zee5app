package com.zee.zee5_app.repository;

import com.zee.zee5_app.dto.Register; // userrepository class is consuming an array of type Register 

public class UserRepository {

	// Repository should consume an array of type Register of size 10
	private Register[] registers = new Register[10];
	private UserRepository() {
		
	}
	
	
	// NOW ADDING METHODS OF REGISTER to this UserRepositoryclass
	
	// To ADD NEW USER to array --> accepts arguments register of type Register
	// This method needs to consumed by the service
	
	      /*private static int count=-1;
	        public String addUser(Register register) {
		    if(count==registers.length) {
			    return "array is full";
		    }
		    registers[++count] = register;
		    return "success"; 		
	      }*/
	private static int count=-1;
	public String addUser(Register register) {
		if(count==registers.length-1) {
			Register temp[] = new Register[registers.length*2];
			// cuz we need to copy contents to new 
			System.arraycopy(register, 0, temp, 0, registers.length);
			registers = temp;
			registers[++count] = register; 
			return "success";
		}
		registers[++count] = register;
		return "success";
	}
	
	
	// RETURN ALL USER DETAILS
	public Register[] getUsers() {
			return registers;
		}
	
	// RETURN USER DETAILS BASED ON ID
    public Register getUserById(String id) {
		for (Register register : registers) {
			if(register!=null && register.getId().equals(Id) ) {
				return register;
			}
		}
		return null;		
	}
    
    // DELETE USER USING ID
    public String delUser(String id, Register register1) {
    	Register temp[] = new Register[registers.length-1];
		for(Register register : egisters) {
			if(register1 != id) {
				System.arraycopy(register, 0, temp, 0, registers.length-1);
			}
		
		}
	}
    
    
    // UPDATE USER 
    public String updateUser(String id, Register register) {
		int count1 = 0;
		for(Register register : registers) {
			if(register!=null && register.getId().equals(id)) {
				registers[count1] = register;
				return("updated");
			}
		}
		count1++;
	}
	
	
	
	private static UserRepository userRepository;
	public static UserRepository getInstance() {
		if(userRepository==null)
			userRepository = new UserRepository();
		return userRepository; 
	}
}
