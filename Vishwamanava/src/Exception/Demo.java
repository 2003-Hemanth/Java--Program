package Exception;

public class Demo {

	public static void main(String[] args) {
		System.out.println(" Raj");
		int [] y= {55,89,25,2};
		
		try {
			System.out.println(y[25]);
		}
		catch(ArrayIndexOutOfBoundsException l)
		{
			System.out.println(" habled");
		}
		System.out.println("oiii");
		
		

	
	}
}
