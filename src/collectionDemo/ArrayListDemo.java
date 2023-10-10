package collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("paris");
		cities.add(2,"NewDelhi");
		cities.add("Mumbai");
		System.out.println(cities.size());
		
		for(String t: cities)
		{
			System.out.println(t);
		}
	}

}
