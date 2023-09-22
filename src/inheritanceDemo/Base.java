package inheritanceDemo;

public class Base {
	
	public int hours=3;
	public int mins=47;
	
	public void openbrowser(String browser) {
		System.out.println("open browser" + browser);
	}
	public  static void login(String username,String password)
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
