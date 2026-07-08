package Logical;

import java.util.Arrays;

public class God {
	static void num(int [] arr ,int s,int e) {
		if(s>=e) {
			System.out.println(arr);
			e++;
			s--;
			
		}
	}

	public static void main(String[] args) {
	      
	      /* for(int i=arr.length-1;i>=0;i--) {
	    	    System.out.println(arr[i]);
	       }*/
		 int[] arr = {1, 3, 5, 7};

        num(arr, 0, arr.length - 1);

	
	      }
}
