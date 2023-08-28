package Lesson_1;

import java.text.NumberFormat;
import java.lang.Math;
import java.util.Scanner;

public class continue_Input_Medthods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
        	System.out.println("Enter your information!!");
        	ageInput();
        	
        	System.out.println("Do this exercises:");
            //inputInfor();
        	
            System.out.println("****************************");
            
            System.out.println("Choose your option to buy at this store.");
            //buyPermit();

            System.out.print("Do you want to continue or stop? Press the any key to continue or n to stop!!! ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("n")) {
                continueInput = false;
            }
        }

        System.out.println("Kết thúc chương trình.");

	}
	public static void inputInfor() {

		//System.out.println("Printer app");
		//String creator  = "Hiep Huynh";
		//System.out.println("This app is made by: " + creator);
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumFractionDigits(4);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st number's value: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Enter 2nd number's value: ");
		double num2 = sc.nextDouble();
		
		double mult = num1*num2;
		double add = num1 + num2;
		double subs = num1 - num2;
		double div = num1/num2;
		//double division = ;
			//System.out.println("The value of number_1 is: "+ num1);
			//System.out.println("The value of number_2 is: "+ num2);
		System.out.println("The multiplication of them is: "+ mult);
		System.out.println("The addition of them is: "+ add);
		System.out.println("The substraction of them is: "+ subs);
		System.out.println("The division of them is: " + nf.format(div));
		
	}
	public static void ageInput() {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Insert your information at below:");
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		if(age > 0 && age < 18) {
			System.out.println("You are underage!");
			System.out.println("**************************");
			if(age < 15) {
				System.out.println("You can drive a bicycle!");
			}
			else if(age > 15) {
				System.out.println("You can drive a mooded");
			}
		}
		else if(age > 18) {
			System.out.println("You are an adult!");
			System.out.println("****************************");
			if(age < 65) {
				System.out.println("You are in labor forces");
			}
			else if (age > 65) {
				System.out.println("You are retired!!! ");
				}
			System.out.println("****************************");
			}
		}
	public static void buyPermit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Make the list of goods you want to buy:\n");
		
		System.out.print("1. ");
		String first = sc.nextLine();
		System.out.print("2. ");
		String second = sc.nextLine();
		
		System.out.print("3. ");
		String third = sc.nextLine();
		
		
		System.out.printf("\nEnter the " + first + "'s price: ");
		int firstPrice = sc.nextInt();
		
		System.out.printf("\nEnter the " + second + "'s price: ");
		int secondPrice = sc.nextInt();
		
		System.out.printf("\nEnter the " + third + "'s price: ");
		int thirdPrice = sc.nextInt();
		
		System.out.print("\nEnter your budget: ");
		int Budget = sc.nextInt();
		int compare,minPrice;
		compare = firstPrice < secondPrice ? firstPrice:secondPrice;
		minPrice = thirdPrice < compare ? thirdPrice:compare;
		
		if (Budget < minPrice) {
			System.out.println("You cannot buy anything at this store!");
		}
		if(Budget >= (firstPrice + secondPrice + thirdPrice)) {
			System.out.printf("\nYou can buy all of them:"+ first + "," + second + " and " + third);
		}
		
		else if(Budget < (firstPrice + secondPrice + thirdPrice)){
			if(Budget > firstPrice + secondPrice){
			System.out.printf("\nYou can buy "+ first + " and " + second);
			
			}
			else if(Budget > firstPrice + thirdPrice) {
				System.out.println("\nYou can buy "+ first + " and " + third);
			}
			else if(Budget > secondPrice + thirdPrice) {
				System.out.println("\nYou can buy "+ second + " and " + third);
			}
			else if ((Budget < (firstPrice + secondPrice))&& (Budget < (firstPrice + thirdPrice))&& (Budget < (thirdPrice + secondPrice))) {
					if(Budget > firstPrice) {
						System.out.println("\nYou can buy the "+ first);
					}
					else if (Budget>secondPrice) {
						System.out.println("\nYou can buy the "+ second);
					}
					else if (Budget > thirdPrice) {
						System.out.println("\nYou can buy the "+ third);
					}
			}
		}
		
		System.out.println("\n****************************");
		}
		
	}
	



