package College;

import java.util.Scanner;

public class Sweet {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println(" Enter String");
	String s=sc.nextLine();
	String rev=" ";
	for(int i=s.length()-1;i>=0;i--)
	{
		//System.out.println(" Enter String");
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);

	}

}
