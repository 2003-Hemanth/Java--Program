package Exception;

public class Stackoverflow {
	static void add()
	{
		System.out.println("hi");
		add();
	}

	public static void main(String[] args) {
		add();
		

	}

}
