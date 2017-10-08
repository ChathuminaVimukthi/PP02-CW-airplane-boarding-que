package Airport;

public class Passenger {
	private String firstName;
	private String lastName;
	private int time;
	
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
