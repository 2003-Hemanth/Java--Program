package College;

import java.util.Scanner;

public class Beta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of strings: ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] h=new String[n];
		for(int i=0;i<h.length;i++)
		{
			h[i]=sc.nextLine();
		}
		for(int i=0;i<h.length;i++)
		{
			System.out.println(h[i]);
		}

	}

}
