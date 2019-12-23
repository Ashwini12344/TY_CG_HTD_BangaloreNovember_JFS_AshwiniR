package com.capgemini.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Pet {
	
	public Pet(String name,Animal animal) {
		this.name=name;
		this.animal=animal;//points to current object
	}
	public Pet() {}
	
	private String name;
	@Autowired
	@Qualifier("dog")//using name of the bean to get object
	private Animal animal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	

}//end of class
