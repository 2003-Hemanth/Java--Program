package Collection;

import java.util.LinkedHashSet;

public class Hanuman {

	public static void main(String[] args) {
		   
		LinkedHashSet p=new LinkedHashSet();
		p.add("Hemanth");
		p.add(5);
		p.add(8);
		p.add("Paru");
		p.add("deer");
		System.out.println(p);
		for(Object n:p)
		{
			System.out.println(n);
		}
		

	}

}
