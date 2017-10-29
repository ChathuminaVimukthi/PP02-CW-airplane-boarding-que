package Airport;

/**
 * Class to represent a passenger in the queue
 */
public class Passenger {
	private String firstName;
	private String lastName;
	private int time;
	
/**
 * Setter for first name of Passenger
 * @param String firstName - first name of passenger
 */
	public void setfirstName(String firstName){
		this.firstName = firstName;
	}
	
/**
 * Getter for first name of Passenger
 * @return String firstName - first name of passenger
 */
	public String getfirstName(){
		return this.firstName;
	}

/**
 * Setter for last name of Passenger
 * @param String lastName - last name of passenger
 */
	public void setlastName(String lastName){
		this.lastName = lastName;
	}
	
/**
 * Getter for last name of Passenger
 * @return String lastName - last name of passenger
 */
	public String getlastName(){
		return this.lastName;
	}
	
/**
 * Setter for queue time of Passenger
 * @param int time - time in seconds waited
 */
	public void setSecondInQueue(int time){
		this.time = time;
	}

/**
 * Getter for queue time of Passenger
 * @return int time - time in seconds waited
 */
	public int getSecondInQueue(){
		return this.time;
	}

}
