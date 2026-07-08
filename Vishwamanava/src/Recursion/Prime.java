package Recursion;

public class Prime {
	static int count=0;
	static int a;
	static void isPrime(int n)
	{
		if(n>=1) {
			if(a%n==0)
			{
				count++;
			}
			isPrime(n-1);
		}
		else
		{
			if(count==2)
			{
				System.out.println("Prine Number");
			}
			else
			{
				System.out.println("Not");
			}
		}
			
	}

	public static void main(String[] args) {
		a=11;
		isPrime(a);
		
		

	}

}
