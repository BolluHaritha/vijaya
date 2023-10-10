package collectionDemo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		HashMap<Integer,String> td = new HashMap<>();
		td.put(123, "Ravi");
		td.put(1234, "Haritha");
		td.put(125, "Bollu Haritha");
		td.put(123189, "umesh");
		
		for(Entry m: td.entrySet())
		{
			System.out.println(m.getKey() + "-" + m.getValue());
		}
		
		System.out.println(td.containsKey(1234));
		
		System.out.println(td.remove(123));
		
		for(Entry m: td.entrySet())
		{
			System.out.println(m.getKey() + "-" + m.getValue());
		}

	}

}
