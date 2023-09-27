package practiceProject;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Shape> shapes = new ArrayList<>();
		
		
		 try {
	           
	            shapes.add(new Rectangle(4, 6));
	           shapes.add(new Square(4));

	            for (Shape shape : shapes) {
	                shape.displayArea();
	            }
	        } catch (Exception e) {
	            System.err.println("An error occurred: " + e.getMessage());
	        } finally {
	            System.out.println("Program execution completed.");
	        }
	}

}
