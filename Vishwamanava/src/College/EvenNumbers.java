package College;


	import java.util.Scanner;

	public class EvenNumbers {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Read size of array
	        System.out.print("Enter the size of the array: ");
	        //int n = sc.nextInt();

	        int[] arr = new int[sc.nextInt()];
	        int l=arr[0];
	        // Read array elements
	        System.out.println("Enter the array elements:");
	        for(int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }
	        //int l=arr[0];

	        // Print even numbers
	        System.out.println(" largest are:");
	        for(int i = 1; i < arr.length; i++) {
	            if(arr[i] >l ) {
	               l=arr[i];
	            }
	            
	        }
	        
			System.out.println(arr[l]);
	       

	        
	    }
	}

