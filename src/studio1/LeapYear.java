package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Value for year?");
		int year = in.nextInt();
		boolean divisibleByFour = (year % 4 == 0);
		boolean notDivisibleByHundred = (year % 100 != 0);
		boolean divisibleByFourHundred = (year % 400 == 0);
		boolean leapYear = divisibleByFour && (notDivisibleByHundred || divisibleByFourHundred);
		
		System.out.println(leapYear + " is a leap year: ");
		
		
	
	}

}
