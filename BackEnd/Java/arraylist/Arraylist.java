
import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Ashwini");
		a1.add("Ajanth");
		a1.add("Savithri");
		a1.add("raghuram");
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		System.out.println(a1.containsAll(a1));
		System.out.println(a1.remove(1));
		System.out.println(a1.retainAll(a1));
		
		System.out.println("list methods");
		a1.add(1, "Nanni");
		System.out.println(a1);
		a1.remove(2);
		System.out.println(a1);
		a1.indexOf("raghuram");
		System.out.println(a1);
		a1.lastIndexOf("Nanni");
		System.out.println(a1);
		System.out.println(a1.get(3));
		System.out.println(a1.set(3, "rosse"));
		System.out.println(a1.subList(0, 2));
		
	}

}
