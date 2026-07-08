package College;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[sc.nextInt()];
		//System.out.println("Enetr the key");
		int key=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
			
				for(int a:arr)
				{
					System.out.println(a);
					if(arr[a]==key);
					{
				System.out.println(a);
				
			}
			}
			
		

	}
	
}


