package com.tyss.queue.priorityqueue;

import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		Queue p1=new PriorityQueue();
		p1.offer(76);
		p1.offer(89);
		p1.offer(12);
		p1.offer(45);
		p1.offer(2);
		System.out.println(p1);
		p1.poll();
		p1.poll();
		System.out.println(p1);
		p1.remove();
		System.out.println(p1);
		p1.peek();
		System.out.println(p1);
		p1.element();
		System.out.println(p1);
		for(Object o1:p1) {
			System.out.println(o1);
		}
	}

}
