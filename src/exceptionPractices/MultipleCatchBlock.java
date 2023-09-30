package exceptionPractices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		try {
		
		System.out.println("Enter a number");
		int num1= scan.nextInt();
		System.out.println("Enter another number");
		int num2 = scan.nextInt();
		
		int result=num1/num2;
		
		System.out.println("The division of two number is : " +result);
		}
		catch(ArithmeticException e) {
			System.out.println("Plase donot enter 0 in denominator");
		}
		catch(InputMismatchException e) {
			System.out.println("Plase enter only integer value");
		}
		catch(Exception e) {
			System.out.println("Plase donot enter valid input");
		}
		scan.close();
		
		
		
		
		
		
		
		
		
		}

}
