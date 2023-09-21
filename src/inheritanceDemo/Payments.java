package inheritanceDemo;

public class Payments extends Homepage {
	
	public void payments()
	{
		System.out.println("Test the payment page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payments obj = new Payments();
		obj.openbrowser("chrome");
		obj.login();
		obj.Homepagetest();
		obj.payments();
		obj.logout();

	}

}
