import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList l2=new LinkedList();
		l2.add(23);
		l2.add(65);
		System.out.println(l2);
		l2.addFirst(45);
		System.out.println(l2);
		l2.addLast(56);
		System.out.println(l2);
		System.out.println("remove");
		l2.remove();
		System.out.println(l2);
		System.out.println("remove first and last");
		l2.removeFirst();
		l2.removeLast();
		System.out.println(l2);
		l2.add(47);
		l2.add(67);
		System.out.println(l2);
		l2.getFirst();
		l2.getLast();
		System.out.println(l2);
		
	}

}
