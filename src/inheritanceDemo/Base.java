package inheritanceDemo;

public class Base {
	
	public void openbrowser(String browser) {
		System.out.println("open browser" + browser);
	}
	public  static void login()
	{
		System.out.println("enter username: " );
		System.out.println("enter password:");
		System.out.println("sign into mailbox");
	}
	
	public void logout()
	{
		System.out.println("click on logout");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
