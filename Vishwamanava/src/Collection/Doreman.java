package Collection;

import java.util.ArrayList;

public class Doreman {

	public static void main(String[] args) {
		ArrayList g=new ArrayList();
		g.add(8);
		g.add(5);
		g.add("Hemanth");
		ArrayList j=new ArrayList();
		j.add(52);
		j.add('k');
		j.add("deer");
		System.out.println(g);
		System.out.println(j);
		g.addAll(j);
		System.out.println(g);
		System.out.println(j);
		g.addAll(1,j);
		System.out.println(g);
		

	}

}
