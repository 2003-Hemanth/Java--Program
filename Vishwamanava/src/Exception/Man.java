package Exception;

public class Man {

	public static void main(String[] args) {
		System.out.println("ramnath");
		try
		{
			System.out.println(1/0);
			
		}
		catch(ArrayIndexOutOfBoundsException k)
		{
			System.out.println("Handled");
			
		}
		catch(StringIndexOutOfBoundsException k)
		{
			System.out.println(" String Handled");
			
		}
		catch(ArithmeticException k)
		{
			System.out.println(" Arithmetic Handled");
			
		}
		

	}

}
