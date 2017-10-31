package Airport;

public class Passenger {
// Setting up the name of the passenger and time.
	private String firstName;
	private String lastName;
	private int time;
	
	public void setfirstName(String firstName){
		this.firstName = firstName;
	}
	// return the firstname of the passenger.
	public String getfirstName(){
		return this.firstName;
	}
	
	public void setlastName(String lastName){
		this.lastName = lastName;
	}
//return the last name of the passenegr.
	
	public String getlastName(){
		return this.lastName;
	}
	
	public void setSecondInQueue(int time){
		this.time = time;
	}
	// return the time in seconds.
	public int getSecondInQueue(){
		return this.time;
	}

}
