import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {
	public static void main(String[] args) {
		Collection c3=new ArrayList();
		c3.add(23);
		c3.add(31);
		c3.add(25);
		c3.add(13);
		System.out.println(c3);
		Collection c4=new ArrayList();
		c4.add(10);
		c4.add(15);
		c4.addAll(c3);
		System.out.println(c4);
		Collection c5=new ArrayList();
		c5.add(25);
		c5.add(23);
		c5.add(12);
		System.out.println(c4);
		c4.retainAll(c5);
		System.out.println(c4);
		Collection c6=new ArrayList();
		c6.add(12);
		c6.add(23);
		//to convert into array
		Object a[]=c6.toArray();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
