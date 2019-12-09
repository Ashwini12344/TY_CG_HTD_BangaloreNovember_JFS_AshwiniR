
abstract public class Abstract {
	int a;
	static int age;
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	abstract void sub(int a,int b);
	public Abstract(int s)
	{
		System.out.println("In zero parameterized constructor");
	}
	static
	{
		age=10;
		System.out.println("In static initializer block");
	}
	{
		this.a=1000;
		System.out.println("In IIB");
	}

}
