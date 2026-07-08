package Logical;

public class Charcharacters {

	public static void main(String[] args) {
		String s="hemanthlkc069@gmail.com";
		String alpha="";
		String digit="";
		String spch="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z')
			{
				alpha=alpha+ch;
			}
			else if(ch>='0'&& ch<='9')
			{
				digit=digit+ch;
				
			}
			else
			{
				spch=spch+ch;
			}
		}
		System.out.println(alpha);
		System.out.println(digit);
		System.out.println(spch);
		

	}

}
