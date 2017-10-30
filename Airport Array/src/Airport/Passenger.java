package Airport;


public class Passenger {
    private String firstName;
    private String lastName;
    private int time;

    /**
     * sets the firstname
     *
     * @param firstName
     */
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the firstname of String type
     */
    public String getfirstName() {
        return this.firstName;
    }

    /**
     * sets the lastname
     *
     * @param lastName
     */
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return lastname of String type
     */
    public String getlastName() {
        return this.lastName;
    }

    /**
     * sets the time
     *
     * @param time
     */
    public void setSecondInQueue(int time) {
        this.time = time;
    }

    /**
     * @return time of integer type
     */
    public int getSecondInQueue() {
        return this.time;
    }

}
