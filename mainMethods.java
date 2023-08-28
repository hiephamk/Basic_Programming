package Lesson_1;

import OtherPackage.exPack;

public class mainMethods {

	public static void main(String[] args) {
		System.out.println("Hello!!");
		textMethods("My name is Hiep");
		//textMethods_new.textMethods();
		//int returnMethod = otheMethods.sum2Numbers(15,20);
		//System.out.print(returnMethod);
		exPack.textMethods();
		

	}
	public static void textMethods(String additionWords) {
		System.out.println("Enter any words: "+ additionWords);
	}
	

}
