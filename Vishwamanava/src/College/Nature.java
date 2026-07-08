package College;

import java.util.Scanner;

public class Nature {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
			
			for(int a:arr)
			{
				if(arr[a]!=0)
				System.out.println(a);
			}
			
		}

	}


