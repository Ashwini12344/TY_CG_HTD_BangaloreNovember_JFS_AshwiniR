import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		System.out.println("peek,peekFirst and peekLast");
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println(l1);
		System.out.println("poll pollFirst and polllast");
		System.out.println(l1.poll());
		System.out.println(l1);
		System.out.println(l1.pollFirst());
		System.out.println(l1);
		System.out.println(l1.pollLast());
		System.out.println(l1);
		System.out.println("Offer offerFirst and offerLast");
		LinkedList l2=new LinkedList();
		l2.add(78);
		l2.add(74);
		l2.add(56);
		System.out.println(l2.offer(89));
		System.out.println(l2.offerFirst(199));
		System.out.println(l2.offerLast(18));
	}

}
