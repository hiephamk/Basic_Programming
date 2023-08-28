package Lesson_1;

import java.util.Scanner;

public class Ex_age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert your information at below:");
		
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
			}
		
		System.out.println("Press space to exit!!!");

	}

}
