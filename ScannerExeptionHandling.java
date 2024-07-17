package dailypractice;

import java.util.Scanner;
import java.util.InputMismatchException;
public class ScannerExeptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner input = new Scanner(System.in);
		       while(true) {
		            System.out.println("Enter Phone number:");
		            try {
		                long number =input.nextLong();
		                System.out.println("You entered: " + number);
		                break; // Exit the loop if input is valid
		            } catch (java.util.InputMismatchException e) {
		                System.out.println("Invalid input. Please enter a valid double.");
		                input.nextLine(); // Consume the invalid input
		            }
		        }
		        input.close(); // Close the scanner
		    }
		


	}


