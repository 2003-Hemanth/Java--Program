package abstract_class;


abstract interface User
{
	void add();
	
}
abstract interface  Demo

{
	void sub();
}
class Test implements User,Demo
{
	public void add()
	{
		System.out.println("Hi");
	}
	public void sub()
	{
		System.out.println("hello");
	}
}

class Sample
{
	public static void main(String[] args)
	{
		Test t=new Test();
		t.add();
		t.sub();
	}
}
