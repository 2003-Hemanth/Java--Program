package College;

import java.util.Scanner;

public class program16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []arr=new int[sc.nextInt()];
		//int key=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println(i);
				return;
			}
			
			
		}
		System.out.println(-1);
		}

	}


