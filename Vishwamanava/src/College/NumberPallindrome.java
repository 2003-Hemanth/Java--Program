package College;

import java.util.Scanner;

public class NumberPallindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int og=n;
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
			
		}
		System.out.println((og==rev)? "Pallindrome":"Not Pallindrome");

	}

}
