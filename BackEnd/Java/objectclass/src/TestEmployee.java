
public class TestEmployee {
	public static void main(String[] args) {
		
		Employee e1=new Employee(23,"ashu");
		System.out.println(e1.hashCode());
		Employee e2=new Employee(24,"ajanth");
		System.out.println(e2.hashCode());
		Object o=new Object();
	}

}
