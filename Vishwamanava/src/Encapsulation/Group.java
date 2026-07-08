package Encapsulation;

class Names
{
	private String Person="Raj";
	public String getPerson()
	{
		return Person;
	}
	public void setPerson(String Person)
	{
		this.Person=Person;
	}
}

public class Group {

	public static void main(String[] args) {
		Names N=new Names();
		System.out.println(N.getPerson());
		N.setPerson("Mahadev");
		System.out.println(N.getPerson());
		

	}

}
