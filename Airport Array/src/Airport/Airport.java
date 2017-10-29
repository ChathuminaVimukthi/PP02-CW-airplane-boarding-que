package Airport;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Airport {
	static Passenger[] passenger = new Passenger[30]; //creates an array of 30 passengers
	public static void main(String[] args) throws FileNotFoundException{
	PassengerQueue queue = new PassengerQueue(20); //creates queue of passengers

	String menu = null;
	
	initialise(passenger); //initializes the array of passengers setting all of them to null 
	
	
	//this outputes the menu to the user	
		
	do{
		System.out.println("\n ****************** Welcome to SL Ariways ******************* \n");
		System.out.println("A:to Add passengers to the boarding queue");
		System.out.println("V:to View the passengers in the queue");
		System.out.println("D:to Delete passengers from the queue");
		System.out.println("S:to Store Passenger data in to a file");
		System.out.println("L:to Load data from file to program");
		System.out.println("R:to Run the simulation and produce report");
		System.out.println("X:to Exit the program  \n");
		System.out.println("Please enter your input");
		
		Scanner sc = new Scanner(System.in); //gets the entered input from the user
		menu = sc.next().toUpperCase(); //puts the entered value from the user in uppercase
		
		switch(menu){ //chooses the correct case based on user input
		case "A" :{
			queue.addQueue();
			break;
		}
		case "D" :{
			queue.deleteQueue();
			break;
		}
		case "V" :{
			queue.viewQueue();
			break;
		}
		case "S" :{
			queue.saveQueue();
			break;
		}
		case "L" :{
			queue.load();
			break;
		}
		case "R" :{
			File inputfile = new File("passengers.dat");

			try {
				Scanner infile = new Scanner(inputfile);
				int x=0;

				while(x<30){	
					passenger[x].setfirstName(infile.next());	
					passenger[x].setlastName(infile.next());
					x++;	
				}

				infile.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			queue.simulateQueue();
			break;
		}
		case "X" :{
			System.out.println("Exit");
			System.exit(0);
		}
		}
		
	}while(menu != "X");
	
	
	}

	//this function initialises the array of passengers
	private static void initialise(Passenger[] passenger) {
		for(int x=0; x<30;x++){
			passenger[x]=new Passenger();
			passenger[x].setfirstName("null");
			
		}		
	}
	
	
}
