package Abstraction;

 interface Application
{
	 void homepage();
	
}

class Map implements Application
{
	 public void homepage()
	{
		System.out.println("Map,Navigation");	
	 }
}
class  Youtube implements Application
{
	  public void homepage()
	{
		System.out.println("Videos,Shorts")	;
	}
}
class Gmail implements Application
{
	  public void homepage()
	{
		System.out.println("Compose,Inbox");	
	}
}
public class MainClass 
{
	public static void main(String[] args)
	{
		Application a1=new Map();
		Application a2=new Youtube();
		Application a3=new Gmail();
		a1.homepage();
		a2.homepage();
		a3.homepage();
		
	}
}

