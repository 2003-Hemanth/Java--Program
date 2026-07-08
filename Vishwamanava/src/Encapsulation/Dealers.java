package Encapsulation;

class Fruits
{
	private String  Famous ="Mango";
	public String getFamous()
	{
		return Famous;
	}
	public void setFamous(String Famous)
	{
		this. Famous= Famous;
	}
}

public class Dealers {

	public static void main(String[] args) {
		Fruits F=new Fruits();
		System.out.println(F.getFamous());
		F.setFamous("apple");
		System.out.println(F.getFamous());

	}

}
