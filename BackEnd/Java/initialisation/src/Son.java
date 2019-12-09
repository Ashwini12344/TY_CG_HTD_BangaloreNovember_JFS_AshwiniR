
public class Son extends Father {
	Son()
	{	super("ash",10);
		System.out.println("c");
	}
	Son(String name,int age)
	{
		this();
		System.out.println("D");
	}

}
