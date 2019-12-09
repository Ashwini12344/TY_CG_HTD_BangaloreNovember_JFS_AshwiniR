import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {
public static void main(String[] args) {
	Collection c1=new ArrayList();
	//adding elent inside collection
	c1.add(12);
	System.out.println(c1);
	//removing elements from collection
	c1.remove(12);
	System.out.println(c1);
	//finding size
	System.out.println(c1.size());
	//checking empty or not
	System.out.println(c1.isEmpty());
	c1.add(12);
	//checking whether 12 object is there or not
	System.out.println(c1.contains(12));
	
}}
