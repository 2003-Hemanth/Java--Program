package Assignment;

class Market
{
	void buy()
	{
		System.out.println("Buy");
	}
	
}
class Vegetable extends Market
{
	void buy()
	{
		System.out.println("onion Tomato");
	}
	
}
class Fruits extends Market
{
	void buy()
	{
		System.out.println("Apple mango");
	}
	
}
class Flowers extends Market
{
	void buy()
	{
		System.out.println("Rose, Hibiscus");
	}
	
}

class Place
{
	static void centre(Market M)
	{
		M.buy();
		
	}
}

public class MainClass {

	public static void main(String[] args) {
		Vegetable V=new Vegetable();
		Fruits F=new Fruits();
		Flowers f=new Flowers();
		Place.centre(V);
		Place.centre(F);
		Place.centre(f);
		

	}

}
