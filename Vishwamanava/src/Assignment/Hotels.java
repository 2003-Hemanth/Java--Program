package Assignment;

class Hotel
{
	void eat()
	{
		System.out.println("choose");
	}
	
}
class Meal extends Hotel
{
	void eat()
	{
		System.out.println("chapathi");
	}
	
}
class chats extends Hotel
{
	void eat()
	{
		System.out.println("panipuri");
	}
	
}
class Juices extends Hotel
{
	void eat()
	{
		System.out.println("watermelon");
	}
	
}

class name
{
	static void price(Hotel H)
	{
		H.eat();
		
	}
}


public class Hotels {

	public static void main(String[] args) {
		Meal M=new Meal();
		chats c=new chats();
		Juices J=new Juices();
		name.price(M);
		name.price(c);
		name.price(J);

	}

}
