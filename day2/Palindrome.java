package week1.day2;

import java.util.Scanner;

public class Palindrome {
	
public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to verify whether it is palindrome or not:");
		int input = in.nextInt();

		// Convert the number to a string to check digits
		String numberStr = Integer.toString(input);
		String output = "";

		// Loop through the string in reverse order
		for (int i = numberStr.length() - 1; i >= 0; i--) {
			output += numberStr.charAt(i);
		}

		// Check if the number is a palindrome
		if (numberStr.equals(output)) {
			System.out.println(input + " is a palindrome.");
		} else {
			System.out.println(input + " is not a palindrome.");
		}

		// to close the input received from the user
		in.close();
	}

}