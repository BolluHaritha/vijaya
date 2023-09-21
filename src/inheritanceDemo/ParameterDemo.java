package inheritanceDemo;

public class ParameterDemo {
	
	public void login(String username,String password)
	{
		System.out.println("Enter username: " + username);
		System.out.println("Enter password: " + password);
		System.out.println("Sign into mailbox");
	}
	
	public void ComposeEmail(String text)
	{
		System.out.println("Compose an Email with text as: " + text);
	}
	
	public void logout()
	{
		System.out.println("Click on logout button");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterDemo obj = new ParameterDemo();
		obj.login("haritha", "admin@123");
		obj.ComposeEmail("Hello All");
		obj.login("admin", "admin");
		obj.logout();

	}

}
