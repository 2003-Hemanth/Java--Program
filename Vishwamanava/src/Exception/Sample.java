package Exception;

public class Sample {

	public static void main(String[] args) {
		System.out.println(" HI");
		String h="Kannada";
		try
		{
			System.out.println(h.charAt(8));
		}
		catch(StringIndexOutOfBoundsException m)
		{
			System.out.println("String exception henled");
		}
		System.out.println("KBT");

	}

}
