package Logical;

public class Rama {

	public static void main(String[] args) {
		 String s="My Name is Hemanth";
		 /*s= s.trim();
      String [] arr=s.split("\\s+");
     for(int i=arr.length-1;i>=0;i--) {
    	   System.out.println(arr[i]+" ");
     }*/
		 
		  for(int i=0;i<s.length()-1;i++) {
			  char ch=s.charAt(i);
			   if(s.equals(" ")) {
				   System.out.println("g");
			   }
			   else {
				   System.out.println(ch);
				   System.out.println("5");
				   System.out.println("6");
			   }
		  }
	}

}
