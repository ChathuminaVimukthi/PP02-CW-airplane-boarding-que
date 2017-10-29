package Airport;

/**
 * This class represents Passenger
 */

public class Passenger {
	private String firstName;
	private String lastName;
	private int time;
	
	/**
	 * This method sets the value for instance variable firstName
	 * @param firstName : String
	 */
	public void setfirstName(String firstName){
		this.firstName = firstName;
	}
	
	
	/**
	 * This method gets the value of instance variable firstName
	 * @return firstName : String
	 */
	public String getfirstName(){
		return this.firstName;
	}
	
	/**
     * This method sets the value for instance variable lastName
     * @param lastName : String
     */
	public void setlastName(String lastName){
		this.lastName = lastName;
	}
	
	/**
     * This method gets the value of instance variable lastName
     * @return lastName : String
     */
	public String getlastName(){
		return this.lastName;
	}

    /**
     * This method sets the value for instance variable time
     * @param time : int
     */	
	public void setSecondInQueue(int time){
		this.time = time;
	}
	
	/**
     * This method gets the value of instance variable time
     * @return time : int
     */
	public int getSecondInQueue(){
		return this.time;
	}

}
