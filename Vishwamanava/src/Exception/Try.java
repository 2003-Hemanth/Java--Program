package Exception;

public class Try {

	public static void main(String[] args) {
		 System.out.println("Main Starts");
		 try {
		 System.out.println(1/0);
		 }
		 catch(ArithmeticException l)
		 {
			 System.out.println("Ecception is handled");
			 
		 }
		 System.out.println("Main ens");

	}

}
