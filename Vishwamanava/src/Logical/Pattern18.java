package Logical;

public class Pattern18 {

	public static void main(String[] args) {
		int n=3;
		int space=0;
		int star=(n*2)-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star=star-2;
			space++;
			
		}

	}

}
