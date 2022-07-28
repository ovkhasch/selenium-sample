package week1.assignments;

import java.util.Iterator;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;
		for (int i = 2; i <= input / 2; i++) {

			System.out.println(i);

			// condition for nonprime number
			if (input % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(input + " is a prime number.");
		else
			System.out.println(input + " is not a prime number.");
	}

}
