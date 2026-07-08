package College;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int l=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>l)
			{
				l=arr[i];
				
			}
		}
		System.out.println(l);
		
		

	}

}
