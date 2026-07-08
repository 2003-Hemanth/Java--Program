package Exception;

public class RTO
{
	  static void license(int age) throws RTOException
	  {
		  if(age>=18)
		  {
			  System.out.println("Eligible");
		  }
		  else
		  {
			  throw new RTOException(" Not Eligible");
		  }
	  }

	public static void main(String[] args) 
	{
		try {
		license(16);
		}
		catch(RTOException g)
		{
			System.out.println(g.get());
		}
	

	}

}
class RTOException extends Exception
{
	private String msg;
	RTOException(String msg)
	{
		this.msg=msg;
	}
	public String get()
	{
		return msg;
	}
}
