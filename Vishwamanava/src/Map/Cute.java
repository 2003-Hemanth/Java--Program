package Map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Cute {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> k=new LinkedHashMap<String,Integer>();
		k.put(" Raju", 85);
		k.put(" mohan", 5);
		k.put("navya", 52);
		k.put(" sanj", 59);
		k.put(" krishna", 89);
		
		for(Entry<String,Integer>  h:k.entrySet())
		{
			System.out.println(h.getKey()+" "+h.getValue());
			
		}

	}

}
