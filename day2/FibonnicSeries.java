package week1.day2;

import java.util.Scanner;

public class FibonnicSeries {

	public static void main(String[] args) {

		// getting input from the user for range
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your range for the series:");
		int range = in.nextInt();
		// initializing the number1 and number2 as 0 and 1
		int n1 = 0, n2 = 1;
		System.out.print("The fibonacci series of " + range + " numbers are ");

		// for loop to create iteration of looping the number to add again and again
		for (int i = 1; i <= range; i++) {
			System.out.print(n1 + " ");

			// to perform addition if current 2 numbers
			int sumOfExistingTwo = n1 + n2;
			// changing the value of the existing number1
			n1 = n2;
			// changing the value of the existing number2
			n2 = sumOfExistingTwo;
		}
		in.close();
	}

}