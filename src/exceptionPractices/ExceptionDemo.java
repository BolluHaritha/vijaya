package exceptionPractices;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 9;
		int j = 0;
		try {
			System.out.println("Result" + i/j);
			}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Please donot give 0 as value of j");
			}
		System.out.println("Result for addition" + i+j);
		System.out.println("Result for subraction" + (i-j));
		System.out.println("Result for multiplication" + i*j);

	}

}
