package com.cg.thread.thread1;

public class Test {
	public static void main(String[] args) {
		System.out.println("Main started");
		Thread1 t1=new Thread1();
		t1.start();
		System.out.println("main ended");
	}

}
