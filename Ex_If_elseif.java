package Lesson_1;

import java.util.Scanner;

public class Ex_If_elseif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter price of goods: \n");
		
		System.out.print("\nEnter the Car's price: ");
		int CarPrice = sc.nextInt();
		
		System.out.print("\nEnter the TV's price: ");
		int BikePrice = sc.nextInt();
		
		System.out.print("\nEnter the Bike's price: ");
		int TvPrice = sc.nextInt();
		
		System.out.print("\nEnter your budget: ");
		double Budget = sc.nextDouble();
		
		if(Budget >= (CarPrice + BikePrice + TvPrice)) {
			System.out.print("\n You can buy the Car,Tv and Bike!!");
		}
		else if((Budget - CarPrice) >= TvPrice || (Budget - CarPrice) >= BikePrice) {
			System.out.print("\nYou can nuy the Car and TV or the Car and Bike!!");
		}
		else if(Budget < CarPrice && Budget >= (TvPrice + BikePrice)) {
			System.out.print("\nYou can buy the TV and Bike!!");
			if((Budget < (TvPrice + BikePrice)) && (Budget > TvPrice)){
				System.out.print("\nYou can buy the TV!!");
				
			}
			else if (Budget < (TvPrice + BikePrice) && (Budget > BikePrice)) {
				System.out.print("\nYou can buy the Bike!!");
			}
		}
		else if (Budget < TvPrice && Budget < BikePrice && Budget < CarPrice) {
			System.out.print("\nYou cannot buy anything at this shop!!");
			}
		}
	

}

