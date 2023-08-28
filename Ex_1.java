package Lesson_1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ex_1 {

	private static final NumberFormat NumberlFormat = null;

	public static void main(String[] args) {
		
		System.out.println("Printer app");
		String creator  = "Hiep Huynh";
		System.out.println("This app is made by: " + creator);
		NumberFormat nf = NumberlFormat.getInstance();
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
		//double division = Double.parseDouble(input);
		System.out.println("The value of number_1 is: "+ num1);
		System.out.println("The value of number_2 is: "+ num2);
		System.out.println("The multiplication of them is: "+ mult);
		System.out.println("The addition of them is: "+ add);
		System.out.println("The substraction of them is: "+ subs);
		System.out.printf("The division of them is: " + nf.format(div));
		
	}

}
