package Collection;

import java.util.ArrayList;

public class Chaota {

	public static void main(String[] args) {
		ArrayList h=new ArrayList();
		h.add(200);
		h.add(400);
		h.add(600);
		h.add(800);
		h.add(true);
		h.add(null);
		h.add(56.2);
		ArrayList k=new ArrayList();
		k.add(200);
		k.add(400);
		k.add(600);
		k.add(800);
		for(int i=0;i<h.size();i++)
		{
			System.out.println(h.get(i));
		}
		for(int i=0;i<k.size();i++)
		{
			System.out.println(k.get(i));
		}


	}

}
