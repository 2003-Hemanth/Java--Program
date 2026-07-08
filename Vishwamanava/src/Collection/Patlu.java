package Collection;
import java.util.ArrayList;

public class Patlu {

	public static void main(String[] args) {
		ArrayList j=new ArrayList();
		j.add(63);
		j.add("um");
		j.add(null);
		j.add(20);
		j.add(50);
		ArrayList o=new ArrayList();
		o.add(63);
		o.add(null);
		o.add(50);
		o.add(0);
		o.add(100);
		o.add(00001);
		System.out.println(j);
		System.out.println(o);
		j.retainAll(o);
		System.out.println(j);
		System.out.println(o);

	}

}
