package Recursion;

public class Demo 
{
	static void num(int n)
	{
		if(n>=0)
		{
			System.out.println(n);
			num(n-1);
		}
	}

	public static void main(String[] args) {
		num(9);

	}

}
