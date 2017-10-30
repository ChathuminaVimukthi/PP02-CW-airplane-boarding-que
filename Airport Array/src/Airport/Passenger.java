/*
*	This class takes passenger information and creates an object based on the given information. 
*/
package Airport;

// Define passenger class
public class Passenger {
	
	// declaring variables
	private String firstName;
	private String lastName;
	private int time;
	
	
	// getters and setters for firstName
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getfirstName(){
		return this.firstName;
	}
	
	// getters and setters for lastName
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getlastName() {
		return this.lastName;
	}
	
	// getters and setters for time
	public void setSecondInQueue(int time) {
		this.time = time;
	}
	
	public int getSecondInQueue() {
		return this.time;
	}

}
