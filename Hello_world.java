package Lesson_1;

import java.util.Scanner;

public class Hello_world {

	public static void main(String[] args) {
		System.out.println("Hello guys!\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value of a: ");
		
		int num1 = sc.nextInt();
		
		System.out.print("Enter a value of b: ");
		int num2 = sc.nextInt();
		
		System.out.print("Power of this number with a value: ");
		int power = sc.nextInt();

		int sumI = num1+num2;
		int mulI = num1*num2;
		String name = "Dan";
		double div = num1/num2;
		
		System.out.println("Div of a and b is: " + div);
		
		System.out.println("Sum of a and b is: " + sumI);
		System.out.println("Multiple of a and b is: "+ mulI);
		if(num1%2 == 0) {
			System.out.println("num1 is even number");
			}
		else {
			System.out.println("num1 is odd number");
			
		}
		if(num2 % 2 == 0){
			System.out.println("num2 is even number");
		}
		else {
			System.out.println("num2 is odd number");
		}
				

	}

}
