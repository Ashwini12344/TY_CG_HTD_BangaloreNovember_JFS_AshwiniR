package multiplecatch;

public class TestExc {
	public static void main(String[] args) {
		System.out.println("main started");
		ExceptionA a1=new ExceptionA();
		a1.exception(0,"ramu");
		a1.exception(2,null);
	}

}
