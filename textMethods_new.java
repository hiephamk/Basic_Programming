package Lesson_1;

import java.util.Scanner;

public class textMethods_new {
	public static void textMethods() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value of a: ");
		int a = sc.nextInt();
		System.out.print("Enter a value of b: ");
		int b = sc.nextInt();
		
		int sum = a + b;
		int sub = a - b;
		System.out.println("Sum of a and b is: "+sum);
		System.out.println("Addtion of a and b is: "+sub);
	}
	

}
