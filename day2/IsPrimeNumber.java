package week1.day2;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to be tested whether it is prime or not");
		int number = in.nextInt();

		int temp = 0, quotient = number / 2;

		// verifying the number for prime
		if (number == 0 || number == 1) {
			System.out.println(number + " is not prime number");
		} else {
			{
				//
				for (int i = 2; i <= number - 1; i++) {
					if (number % i == 0) {
						System.out.println(number + " is not prime number");
						temp = 1;
						break;// used to stop the
					}
				}
				if (temp == 0) {
					System.out.println(number + " is prime number");
				}
			}
		}
		in.close();
	}
}