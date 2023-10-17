package inheritanceDemo;

public class MethodsDemo1 {
	
	public void login()
	{
		System.out.println("Enter usename");
		System.out.println("Enter password");
		System.out.println("Signin to mailbox");
	}
	
	public void ComposeEmail()
	{
		System.out.println("Compose an Email");
	}
	
	public void logout()
	{
		System.out.println("Click on the logout button");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo1 obj = new MethodsDemo1();
		obj.login();
		obj.ComposeEmail();
		obj.logout();

	}

}
