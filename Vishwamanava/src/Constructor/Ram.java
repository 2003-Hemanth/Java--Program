package Constructor;

public class Ram {
	Ram(int a)
	{
		System.out.println(" I am First"+a);
	}
}

class Raj extends Ram
{
	Raj()
	{
	
	super(20);
	System.out.println(" I am Second ");
}


	public static void main(String[] args) {
		new Raj();
		

	}
	}


