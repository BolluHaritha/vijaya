package lessonendproject;

import java.util.Scanner;

public class project1 {
	
	public void area(int l,int w)
	{
		System.out.println("the are of rectangle is:" + l*w);
		
	}
	public void area(int l)
	{
		System.out.println("the are of square is:" + l*l);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the length");
		int l= scan.nextInt();
		System.out.println("Enter the width");
		int w=scan.nextInt();
		
		project1 obj =new project1();
		try {
			obj.area(l, w);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			try {
				 obj.area(l);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			scan.close();
		
		

	}

}
