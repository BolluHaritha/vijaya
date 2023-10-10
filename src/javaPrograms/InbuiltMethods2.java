package javaPrograms;

public class InbuiltMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "simplilearn online courses";
		if(title.contains("simplilearn")) {
			System.out.println("Title is valid. Tese case is pass");
		}
		else {
			System.out.println("Title is not valid. Test case is failed");
		}
		
		if(title.equals("simplilearn online courses")) {
			System.out.println("Title is valid. Tese case is pass");
		}
		else {
			System.out.println("Title is not valid. Test case is failed");
		}
		String title2 = "Practice Labs Java";
		String result = title2.substring(14);
		if(result.equals("Java"))
		{
			System.out.println("String is invalid");
		}
		else
		{
			System.out.println("String is invalid");
		}

	}

}
