package Logical;

public class ReverseSentence {

	public static void main(String[] args) {


		String s="I am an Boy";
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev =rev+s.charAt(i);
			
		}
         System.out.print(rev);
	}

}


	


