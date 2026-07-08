package Exception;

public class Null {

	public static void main(String[] args) {
		System.out.println("Hi");
		Null s=null;
		try
		{
			System.out.println(s.hashCode());
		}
		catch(NullPointerException h)
		{
			System.out.println("Null pointer exception can handled");
			
		}
		System.out.println("Bye");

	}

}
