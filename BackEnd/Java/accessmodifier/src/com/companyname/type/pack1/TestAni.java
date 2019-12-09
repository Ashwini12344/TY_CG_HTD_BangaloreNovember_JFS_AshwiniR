package com.companyname.type.pack1;

public class TestAni {
public static void main(String[] args) {
	Animal a1=new Animal();
	a1.eat();
	Animal a2=new Dog();
	a2.eat();
	Dog d1=(Dog)a2;
	d1.eat();
	d1.walk();
}
}
