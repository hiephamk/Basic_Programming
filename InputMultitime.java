package Lesson_1;

import java.util.Scanner;

public class InputMultitime {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        boolean continueLoop = true;

	        while (continueLoop) {

	            System.out.println("Insert your information at below:");
	    		
	    		System.out.print("Enter your age: ");
	    		int age = sc.nextInt();
	    		
	    		if(age > 0 && age < 18) {
	    			System.out.print("You are underage!");
	    			System.out.print("**************************");
	    			if(age < 15) {
	    				System.out.print("You can drive a bicycle!");
	    			}
	    			else if(age > 15) {
	    				System.out.print("You can drive a mooded");
	    			}
	    		}
	    		else if(age > 18) {
	    			System.out.print("You are an adult!");
	    			System.out.print("****************************");
	    			if(age < 65) {
	    				System.out.print("You are in labor forces");
	    			}
	    			else if (age > 65) {
	    				System.out.print("You are retired!!! ");
	    				}
	    		}
	        

	            System.out.print("Tiếp tục? (y/n): ");
	            String choice = sc.nextLine();

	            if (choice.equalsIgnoreCase("n")) {
	                continueLoop = false;
	            }
			}

	        sc.close();
	        System.out.println("Kết thúc chương trình.");
	    }

}

