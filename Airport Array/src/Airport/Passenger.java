
package Airport;

//Class for storing passengers information
public class Passenger {

	//declaring variables for storing there named resources
	private String firstName;
	private String lastName;
	private int time;
	

	//getter and setter
	public void setfirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getfirstName(){
		return this.firstName;
	}
	
	public void setlastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getlastName(){
		return this.lastName;
	}
	
	public void setSecondInQueue(int time){
		this.time = time;
	}
	
	public int getSecondInQueue(){
		return this.time;
	}

}
