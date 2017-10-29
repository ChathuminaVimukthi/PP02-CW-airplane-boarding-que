package Airport;

/**
 * This class represents a Passenger
 */
public class Passenger {
	private String firstName;
	private String lastName;
	private int time;
	
	/**
	 * Set the first name of the passenger
	 */
	public void setfirstName(String firstName){
		this.firstName = firstName;
	}
	
	/**
	 * the first name of the passenger
	 * @return firstName
	 */
	public String getfirstName(){
		return this.firstName;
	}
	
	/**
	 * Sets the last name of the passenger
	 * @param lastName
	 */
	public void setlastName(String lastName){
		this.lastName = lastName;
	}
	
	/**
	 * Return the last name of this passenger
	 * @return lastName
	 */
	public String getlastName(){
		return this.lastName;
	}
	
	/**
	 * Sets the queued time for this passenger
	 * @param time
	 */
	public void setSecondInQueue(int time){
		this.time = time;
	}
	
	/**
	 * Returns the time, when the passenger was queued
	 * @return int(representing time)
	 */
	public int getSecondInQueue(){
		return this.time;
	}

}
