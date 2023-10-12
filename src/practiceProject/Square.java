package practiceProject;

public class Square extends Shape{
	
	private int length;
	  

    public Square(int length) {
        this.length = length;
      
    }

    public void displayArea() {
        System.out.println("Area of the Square: " + calculateArea());
    }

    public double calculateArea() {
        return length * length;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
