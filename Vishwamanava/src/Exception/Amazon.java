package Exception;

public class Amazon 
{
	  static void order(int amt) throws AmazonException
	  {
		  if(amt>=500)
		  {
			  System.out.println("Free Delivery");
		  }
		  else
		  {
			  throw new AmazonException(" Delivery charges is applied");
		  }
	  }

	public static void main(String[] args) 
	{
		try {
		 order(300);
		}
		catch(AmazonException j)
		{
			System.out.println(j.get());
			
		}
		

	}

}
class AmazonException extends Exception
{
	private String msg;
	AmazonException(String msg)
	{
		this.msg=msg;
	}
	public String get()
	{
		return msg;
	}
}
