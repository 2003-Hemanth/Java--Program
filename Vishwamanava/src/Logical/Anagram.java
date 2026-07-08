package Logical;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	 String s1="dog";
	 String s2="godA";
	 if(s1.length()==s2.length())
	 {
		 s1=s1.toLowerCase();
		 s2=s2.toLowerCase();
		 char[] ch1=s1.toCharArray();
		 char[] ch2=s2.toCharArray();
		 Arrays.sort(ch1);
		 Arrays.sort(ch2);
		 String a= new String(ch1);
		 String b=new String(ch2);
		 if(a.equals(b))
			 System.out.println("I is a anagram");
		 else
			 System.out.println("I is  not a anagram");
		}
	 else
	 { 
		 System.out.println("I is  not a anagram from this word"); 
		 
	 }

	}

}
