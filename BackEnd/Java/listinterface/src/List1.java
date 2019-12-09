import java.util.List;
import java.util.ArrayList;

public class List1 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(0,12);
		l1.add(1,13);
		l1.add(2,14);
		l1.add(3,15);
		l1.add(4,12);
		System.out.println(l1);
		//l1.add(2,12);
		
		l1.remove(1);
		System.out.println(l1);
		
		System.out.println(l1.indexOf(14));
		System.out.println(l1.lastIndexOf(12));
		
		
	}

}
