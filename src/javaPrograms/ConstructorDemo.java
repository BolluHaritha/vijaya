package javaPrograms;

public class ConstructorDemo {
	
	public ConstructorDemo()
	{
		System.out.println("This a default constructor");
		
	}
	public ConstructorDemo(int a)
	{
		System.out.println("This is parametrized constuctor");
		System.out.println("The value of variable is:" + a);
	}
	public ConstructorDemo(int a,int b)
	{
		System.out.println("This is parametrized constuctor");
		System.out.println("The value of variable is:" + a);
		System.out.println("The value of variable is:" + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo obj = new ConstructorDemo();
		ConstructorDemo obj2 = new ConstructorDemo(10);
		ConstructorDemo obj3 = new ConstructorDemo(10,20);

	}

}
