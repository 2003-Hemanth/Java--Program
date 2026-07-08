package Logical;

public class ArmStrong {
	public static void main(String[] args) {
		int n=153;
		int og=n;
		int sum=0;
		while(n!=0)
		{
			int rem =n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
			
		}
		System.out.println((sum==og) ? "ArmStrong Number":" Non Armstrong");
	}

}
