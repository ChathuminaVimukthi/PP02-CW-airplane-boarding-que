package Airport;

//Defines the class names Passenger
public class Passenger {
//	Declaration of  private attributes of the class
	private String firstName;
	private String lastName;
	private int time;
	
//	Method to set the first name with a string parameter of the first name
	public void setfirstName(String firstName){
		this.firstName = firstName;
	}
	
//	Method to return the first name
	public String getfirstName(){
		return this.firstName;
	}
	
//	Method to set the last name with a string parameter of the last name
	public void setlastName(String lastName){
		this.lastName = lastName;
	}
	
//	Method to return the last name
	public String getlastName(){
		return this.lastName;
	}
	
//	Make an item second in the queue by checking with the time parameter (in a queue of items)
	public void setSecondInQueue(int time){
		this.time = time;
	}
	
//	Return the second item in the queue (in a queue of items)
	public int getSecondInQueue(){
		return this.time;
	}

}
