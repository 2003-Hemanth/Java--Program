package Collection;
import java.util.ArrayList;

public class Motu {

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
		System.out.println(j.retainAll(o));
		
	}

}
