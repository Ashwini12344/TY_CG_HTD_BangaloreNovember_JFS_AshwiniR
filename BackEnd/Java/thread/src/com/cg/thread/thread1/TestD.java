package com.cg.thread.thread1;

public class TestD {

	public static void main(String[] args) {
		System.out.println("main started");
		IRCTC i1=new IRCTC();
		User1  u1=new User1(i1);
		User1 u2=new User1(i1);
		u1.start();
		u2.start();
		i1.leaveMe();
		System.out.println("main ended");
		
		

	}

}
