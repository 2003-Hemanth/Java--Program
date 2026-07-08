package Recursion;

public class Even {
	static void num(int n)
	{
		if(n<=20)
		{
			if(n%2==0)
			{
				System.out.println(n);
				
			}
			num(n+1);
		}
	}

	public static void main(String[] args) {

       num(0);
	}

}
