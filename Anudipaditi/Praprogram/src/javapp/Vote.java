//Write a program take a input from the age  the user if the age is above 18 print "you are eligible 
		//to  vote  else throw an ecepation that age is not correct
package javapp;
import java.util.*;

public class Vote {

			public static void main(String[] args) {
				int age ;
				Scanner sc=new Scanner(System.in);
			    System.out.println("Enter your age");
			    age=sc.nextInt();
			    try {
			    
			    	if(age>=18)
			  
				    System.out.println("You are eligible for voting");
			    	else {
			    		throw new Exception("You are not eligible for vote");
			    	}
			    		
			    	
			    }
			    catch(Exception e)
			    {
			     System.out.println(e);
			    
			    
				   
			    }


			    	
			}

		


	}


