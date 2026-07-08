package Collection;

import java.util.LinkedList;

public class pogo {

	public static void main(String[] args) {
		LinkedList r=new LinkedList();
		r.add(20);
		r.add(30);
		r.add(50);
		r.add(60);
		r.add("Hello");
		r.add(true);
		System.out.println(r);
		System.out.println(r.get(3));
		System.out.println(r.peek());
		System.out.println(r);
		System.out.println(r.poll());
		System.out.println(r);
		

	}

}
