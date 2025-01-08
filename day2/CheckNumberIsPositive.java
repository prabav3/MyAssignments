package week1.day2;

public class CheckNumberIsPositive {

	public static void main(String[] args) {

		int number = 10;
		// to verify number is positive
		if (number > 0) {
			System.out.println("The number " + number + " is positive integer");
		}
		// to verify the number is negative
		else if (number < 0) {
			System.out.println("The number " + number + " is negative integer");
		}
		// to verify the number == 0
		else {
			System.out.println("the number is equal to zero(0)");
		}
	}
}