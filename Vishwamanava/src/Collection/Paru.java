package Collection;

import java.util.HashSet;

public class Paru {

	public static void main(String[] args) {
		
		HashSet k=new HashSet();
		k.add(20);
		k.add("Hi");
		k.add(580);
		k.add("Go");
		k.add(89);
		System.out.println(k);
		for(Object l:k)
		{
			System.out.println(l);
		}
		
		
		

	}

}
