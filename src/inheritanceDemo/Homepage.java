package inheritanceDemo;

public class Homepage extends Base {
	
	public void Homepagetest()
	{
		System.out.println("Test for the Home page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Homepage obj = new Homepage();
		obj.openbrowser("chrome");
		login("admin","admin@123");
		obj.Homepagetest();
		obj.logout();

	}

}
