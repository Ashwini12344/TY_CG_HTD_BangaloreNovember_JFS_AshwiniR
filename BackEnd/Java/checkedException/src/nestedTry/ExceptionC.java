package nestedTry;

public class ExceptionC {
	public static void main(String[] args) {
	Employee e1=new Employee();
	try {
	Object e2=e1.clone();
	try {
		Class c1=Class.forName("nestedTry.Employee");
		System.out.println("class is found");
	}
	catch(ClassNotFoundException e) {
		System.out.println("class not found");
	}
	}
	catch(CloneNotSupportedException c ) {
	System.out.println("main ended");
	
	}

}
}
