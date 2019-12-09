
public class TestPerson {
	public static void main(String[] args) throws Throwable {
		System.out.println("---main method started---");
		Person p1=new Person("John");
		p1.finalize();
		System.gc();
		System.out.println("main ended");
	}

}
