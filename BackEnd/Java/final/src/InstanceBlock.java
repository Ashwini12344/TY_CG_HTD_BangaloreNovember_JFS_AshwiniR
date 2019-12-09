
public class InstanceBlock {
	final int a;
	static double PI;
	public InstanceBlock(int a)
	{
		System.out.println("Constructor");
		
	}
	{
		this.a=10000;
		System.out.println("Instance block ");
	}
	static
	{
		System.out.println("static initializer block");
		PI=3.14;
	}
}
