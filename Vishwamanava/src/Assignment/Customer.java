package Assignment;


class Phonepay
{
	private int check=6890;
	public int getcheck()
	{
		return check;
		
	}
	
	public void setcheck(int  check)
	{
		this.check=check;
		
	}
}
public class Customer {

	public static void main(String[] args) {
		Phonepay p=new Phonepay();
		System.out.println(p.getcheck());
		p.setcheck(2222);
		System.out.println(p.getcheck());
		

	}

}
