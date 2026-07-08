package Collection;

import java.util.ArrayList;

public class Kaliya {

	public static void main(String[] args) {
		ArrayList h=new ArrayList();
		h.add(200);
		h.add(400);
		h.add(600);
		h.add(800);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(6);
		ArrayList p=new ArrayList();
		p.add(200);
		p.add(400);
		p.add(600);
		p.add(800);
		System.out.println(h.containsAll(p));


	}

}
