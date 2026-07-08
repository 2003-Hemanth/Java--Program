package Logical;

public class ReverseString 
{
	public static void main(String[] args) {
		

	
	 String g="Values";
	 String rev=" ";
	 
	 for(int i=g.length()-1;i>=0;i--)
	 {
		char ch=g.charAt(i);
		rev=rev+ch;
	 }
	   System.out.println(rev);
	 

	}

}
