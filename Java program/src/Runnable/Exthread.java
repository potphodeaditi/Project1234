package Runnable;
import java.util.*;
class Userun extends Thread{
	public void run() {
		int oldSalary;
	  	int hike;
	  
	  	Scanner in = new Scanner(System.in);
	  	
	  	System.out.println("Enter your old salary per month:");
	  	oldSalary = in.nextInt();
	  	
	  	System.out.println("Enter your hike percentage:");
	  	hike = in.nextInt();
	  	
	  	int presentSalary = oldSalary + (oldSalary * hike/100);
	  	
	  	
	  	System.out.println("After hike your present salary per month is: " + presentSalary );
	  }
	

	}



public class Exthread {

	public static void main(String[] args) {
		Userun a1=new Userun();
		a1.start();
		
		// TODO Auto-generated method stub

	}
}


