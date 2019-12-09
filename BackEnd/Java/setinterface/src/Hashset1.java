import java.util.HashSet;
public class Hashset1 {
	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add(23);
		hs.add(86);
		hs.add(12);
		hs.add(44);
		hs.add(23);
		hs.add(null);
		for(Object object:hs) {
			System.out.println(object);
		}
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("Ashwini");
		hs1.add("janavi");
		hs1.add("Ashika");
		hs1.add("Sanma");
		hs1.add(null);
		for(String s1:hs1) {
			System.out.println(s1);
		}
	}

}
