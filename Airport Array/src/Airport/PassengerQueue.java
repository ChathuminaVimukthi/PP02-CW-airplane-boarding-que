package Airport;

/**
 * This class represents Passenger Queue
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PassengerQueue {
	private int capacity;
	int front = 0;
	int last = 0;
	int Size = 0;
	
	
	
	static Scanner sc = new Scanner(System.in);

	
	Passenger[] passengerQueue = new Passenger[20];
	
	/**
	 * Initializes instance variables of class PassengerQueue
	 * @param queueSize : int
	 */
	public PassengerQueue(int queueSize) {//intializing the capacity to array size
		this.capacity=queueSize;
		passengerQueue = new Passenger[this.capacity];
		initialize(passengerQueue);
	}
	
	
	/**
	 * This method initializes firstname and lastname of passengers in PassengerQueue object array with null
	 * @param PassengerQueue : Passenger[]
	 */
	public void initialize(Passenger[] PassengerQueue){
		for(int i=0;i<passengerQueue.length;i++){
			passengerQueue[i] = new Passenger();
			passengerQueue[i].setfirstName("null");
			passengerQueue[i].setlastName("null");
		}
	}
	
    /**
     * This method adds passeneger detail in queue. It shows appropriate message if queue is full.
     */
public void addQueue() {//adding passengers to the queue array
        
        if (isQueueFull()) {
            System.out.println("Queue is full.Unable to add passenger");
        } else {
            if(last == capacity-1){
                last = 0;
            }
            System.out.print("Enter passenger's first name:");
            passengerQueue[last].setfirstName(sc.next().toUpperCase());
            System.out.print("Enter passenger's last name:");
            passengerQueue[last].setlastName(sc.next().toUpperCase());
            System.out.print("Enter passenger's delay time:");
            passengerQueue[last].setSecondInQueue(sc.nextInt());
            System.out.println(passengerQueue[last].getfirstName()+" "+passengerQueue[last].getlastName()+" is added to Queue.");
            System.out.println(passengerQueue[last].getSecondInQueue()+ " (s) delay time is added to Queue. ");
            Size++;
            last++;

        }
    }
	
    /**
     * This method deletes the passeneger details from queue if it is not empty. It shows appropriate message if queue is empty.
     */
public void deleteQueue() {//deleting the first passenger in the queue array
	if (isQueueEmpty()) {
		System.out.println("Queue is Empty. No data to delete");
	} else {
		front++;
		
		
		if(front == capacity-1){
			System.out.println("Data for passenger "+passengerQueue[front-1].getfirstName()+" "+passengerQueue[front-1].getlastName()+" deleted.");
			passengerQueue[front-1].setfirstName("null");
			passengerQueue[front-1].setlastName("null");
			passengerQueue[front-1].setSecondInQueue(0);
			front = 0;
		} else {
			if(!passengerQueue[front-1].getfirstName().equals("null")){
			System.out.println("Data for passenger "+passengerQueue[front-1].getfirstName()+" "+passengerQueue[front-1].getlastName()+" deleted.");
			passengerQueue[front-1].setfirstName("null");
			passengerQueue[front-1].setlastName("null");
			passengerQueue[front-1].setSecondInQueue(0);
			}
		}
		Size--;
	}
}

    /**
     * This method saves the passenger details in Passenger.txt file
     */
	public void saveQueue(){
		try {
			// getting the passenger text file
			File passengerfile = new File("Passenger.txt");
			PrintWriter printWriter = new PrintWriter(passengerfile);
			// printing the all array element text file
			for (int j = 0; j < passengerQueue.length; j++) {
				if (passengerQueue[j].getfirstName() != null) {
					// printing the a array element text file
					printWriter.println(passengerQueue[j].getfirstName()+" "+passengerQueue[j].getlastName()+" "+passengerQueue[j].getSecondInQueue());
					
				} else {
					printWriter.println(passengerQueue[j].getfirstName());
				}
			}
			System.out.println("Succesfully added");
			printWriter.close();
		} catch (IOException e) {
			System.out.println("Check your file.");
		}
	}
	
	
	/**
	 * This method is used to display passenger details who are in queue if the queue is not empty. 
	 * It shows appropriate message if queue is empty.
	 */
	public void viewQueue(){
		if(isQueueEmpty()){
			System.out.println("Empty Queue!! No data to view");
		}else{
			for(int i = 0;i<passengerQueue.length; i++){
				System.out.println(passengerQueue[i].getfirstName()+" "+passengerQueue[i].getlastName());
				//System.out.println());
				System.out.println("Time "+passengerQueue[i].getSecondInQueue());
			}
		}
	}
	
	/**
     * This method loads the passenger details from Passenger.txt file
     */
	public void load() {
		Scanner scanning = null;
		try {
			// getting  passenger text file
			File passengerfile = new File("Passenger.txt");
			scanning = new Scanner(passengerfile);
			int i = 1;
			// reading  each line in the text file
			while (scanning.hasNext()) {
				// filling the array with customer name
			
					passengerQueue[i].setfirstName(scanning.next());
					passengerQueue[i].setlastName(scanning.next());
					passengerQueue[i].setSecondInQueue(scanning.nextInt());
					System.out.println(passengerQueue[i].getfirstName()+" "+passengerQueue[i].getlastName()+" "+passengerQueue[i].getSecondInQueue());

				i=(i+1)%20;
				
			}
			System.out.println("Succesfully loaded");
		} catch (IOException e) {
			System.out.println("Check your file.");
		} finally {
			scanning.close();
		}
	}
	
	
	/**
     * This method checks if queue is full
     * @return boolean
     */
	boolean isQueueFull(){
		boolean status = false;
		if (Size == 20){
			status = true;            
		}
		return status;
	}

	/**
	 * This method checks if queue is empty
	 * @return boolean
	 */
	boolean isQueueEmpty(){
		boolean status = false;
		if (Size == 0){
			status = true;
		}
		return status;
	}

	/**
	 * This method simulates the queue
	 * @throws FileNotFoundException
	 */
	public void simulateQueue() throws FileNotFoundException {
		initialize(passengerQueue);//to remove current entries of the queue

		last=0;
		front=0;
		
		int position =0;
		int timeDelay=0;
		int count=0;
		int index=0;
		int noofppl=0;
		int totalTime=0;
		int emptyQueue=0;
		int emptyList= 0;
		int delay = 0;
		int mindelay = 0;
		int maxdelay = 0;
		int a = 0;
		


		File report = new File("report.dat");

		PrintWriter output = new PrintWriter(report);



		do{

			for(int x=0 ; x<passengerQueue.length ;x++){

				if((passengerQueue[x].getfirstName().equalsIgnoreCase("null"))){

					emptyQueue++;	
				}	
			}
			
		
			noofppl=D6();

			if(emptyQueue>0){

			

				if(noofppl<emptyQueue){
					
					for (int x=0;x<noofppl;x++){
						
						if(position>=30){
							position=0;
							break;
							
						}
						delay = nD6(3);
						timeDelay=timeDelay+delay;

						totalTime=totalTime+timeDelay;

						
						passengerQueue[last].setfirstName(Airport.passenger[position].getfirstName());
						passengerQueue[last].setlastName(Airport.passenger[position].getlastName());
						passengerQueue[last].setSecondInQueue(timeDelay);

						
						Airport.passenger[position].setfirstName("null");
						


						mindelay = Math.min(timeDelay,delay);
						maxdelay = Math.max(timeDelay,delay);
						
						last=(last+1)%20;
						position++;
					}
				}
			}
			
			
			



			for(int x=0;x<noofppl;x++){

				if(!(passengerQueue[index].getfirstName().equalsIgnoreCase("null")) && count<30 ){
					

					System.out.print(passengerQueue[index].getfirstName()+" "+passengerQueue[index].getlastName()+" \n Time "+passengerQueue[index].getSecondInQueue()+"\n");
					output.print(passengerQueue[index].getfirstName()+" "+passengerQueue[index].getlastName()+" \n Time "+passengerQueue[index].getSecondInQueue()+"\n");

					count++;

					index=(index+1)%20;
				}


			}

			
			passengerQueue[front].setfirstName("null");
			passengerQueue[front].setlastName("");
			passengerQueue[front].setSecondInQueue(0);
			
			front=(front+1)%20;


			if(emptyQueue==0){

				System.out.println("Queue is full");

			}

			emptyList = 0;

			for(int x=0 ; x<30 ;x++){

				if((Airport.passenger[x].getfirstName().equalsIgnoreCase("null"))){

					emptyList++;	
				}	
			}
			
			


		}while(emptyList!=30);
		
	
		
		a=0;
		for(int i=0;i<20;i++){
			if(!(passengerQueue[i].getfirstName().equals("null"))){
				
				a++;
				
			}
		}
		System.out.println("Mximum length of the queue :"+a);
		output.print("\n Minimum Delay "+mindelay+" seconds. \n Maximum Delay "+maxdelay+" seconds. \n Average Delay "+timeDelay/30+" seconds.\n Total Delay "+timeDelay+" seconds. \n Maximum length of the Queue :"+a);
		output.close();
		System.out.println("Total Delay time :"+ timeDelay+" (s)");
		System.out.println("Minimum delay time of a passenger :"+mindelay+" (s)");
		System.out.println("Maximum delay time of a passenger :"+maxdelay+" (s)");

		last=0;
		front=0;
		
		
	}
	
	/**
	 * This method uses the alogrithm a+b*c to generate a random integer between 1 and 6.
	 */
	public static int D6() {
        return (int) (1 + 6 * Math.random());
	}


	/**
	 * 
	 * @param int : n
	 */
	public static int nD6(int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum = sum + D6(); 
    }
    return sum;
	}

	
}