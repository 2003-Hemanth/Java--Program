package Assignment;

class Main
{
	void water()
	{
		System.out.println("choose");
	}
	
}
class Ganga extends Main
{
	void water()
	{
		System.out.println("chapathi");
	}
	
}
class Krishna extends Main
{
	void water()
	{
		System.out.println("panipuri");
	}
	
}
class bheema extends Main
{
	void water()
	{
		System.out.println("watermelon");
	}
	
}

class collect
{
	static void point(Main M)
	{
		M.water();
		
	}
}
public class Rivers {

	public static void main(String[] args) {
		Ganga G=new Ganga();
		Krishna k=new Krishna();
		bheema B=new bheema();
		collect.point(G);
		collect.point(k);
		collect.point(B);
		

	}

}
