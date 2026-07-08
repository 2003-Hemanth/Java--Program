package Constructor;

public class Nagin {
	Nagin(int a)
	{
		this("Hi");
		System.out.println(a);
	}
	Nagin(String b)
	{
		System.out.println(b);
	}

	public static void main(String[] args) {
		new Nagin(9);
		

	}

}
