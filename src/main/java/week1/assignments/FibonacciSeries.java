package week1.assignments;

public class FibonacciSeries {
	
	public static void main(String[] args) {

			// Set it to the number of elements you want in the Fibonacci Series
			 int range = 8; 
			 int firstNum = 0;
			 int secNum = 1;
			 
		        for (int i = 1; i <= range; i++)
		        {
		            System.out.print(" Fibonacci number of " + firstNum + " ");
		            /* On each iteration, we are assigning second number
		             * to the first number and assigning the sum of last two
		             * numbers to the second number
		             */
	 
		      
		            int sum = firstNum + secNum;
		            firstNum = secNum;
		            secNum = sum;
		            System.out.println(" is " + sum + " ");
		        }
		}
	}
		

