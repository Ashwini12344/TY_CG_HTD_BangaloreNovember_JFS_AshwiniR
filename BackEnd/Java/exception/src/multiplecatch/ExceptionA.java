package multiplecatch;

public class ExceptionA {
	void exception(int a, String b)
	{
		try {
			System.out.println(500/a);
			try {
			System.out.println(b.length());
			}
			catch(NullPointerException n)
			{
				System.out.println("dont deal with null");
			}
		
		}
		catch(ArithmeticException e) {
			System.out.println("dont deal with 0");
		}
		}
		

}
