import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSet3 {
	public static void main(String[] args) {
		LinkedHashSet<Employee> l1=new LinkedHashSet<Employee>();
		l1.add(new Employee(22,"Ramu"));
		l1.add(new Employee(24,"Gunu"));
		l1.add(new Employee(24,"Gunu"));
		Iterator<Employee>itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		}

}
