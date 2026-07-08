package College;

import java.util.Scanner;

public class SumofEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long sum=0;
		while(n!=0)
		{
			long rem=n%10;
			if(rem%2==0)
			{
				sum=sum+rem;
				
			}
			n=n/10;
		}
		System.out.println(sum);

	}

}
