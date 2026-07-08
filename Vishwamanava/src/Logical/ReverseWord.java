package Logical;

public class ReverseWord {

	public static void main(String[] args) {
		String s=" I am from KBT";
		String[] arr=s.split(" ");
		for(int j=0;j<arr.length;j++)
		{
			if(j==2) 
			{
				String s2=arr[j];
				String rev=" ";
				for(int i=s2.length()-1;i>=0;i--)
				{
					rev=rev+s2.charAt(i);
				}
				System.out.print(rev+" ");
			}
			else
				System.out.print(arr[j]+" ");
		}
		

	  }

}
