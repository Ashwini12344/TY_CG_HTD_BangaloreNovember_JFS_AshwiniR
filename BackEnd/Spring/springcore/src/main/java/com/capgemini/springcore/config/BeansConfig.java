package com.capgemini.springcore.config;

import org.springframework.beans.factory.support.GenericTypeAwareAutowireCandidateResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.capgemini.springcore.beans.Author;
import com.capgemini.springcore.beans.Book;
import com.capgemini.springcore.beans.Cat;
import com.capgemini.springcore.beans.Dog;
import com.capgemini.springcore.beans.Hello;
import com.capgemini.springcore.beans.Pet;

@Configuration
public class BeansConfig {
	@Bean("hello") //name of the bean we cant give any other attribute
	@Scope("prototype")//if we make is singleton it will display destroy method
	public Hello getHello() {
		Hello hello=new Hello();
		hello.setMesssage("I love India");
	    return hello;
		
	}
	@Bean(name="dog")//by default method name will be the name of the bean and it can take other attribute separated by comma
	public Dog getDog() {
		return new Dog();
	}
	@Bean("cat")
	@Primary
	public Cat getCat() {
		return new Cat();
	}
	@Bean("pet")
	public Pet getPet() {
		Pet pet=new Pet();
		pet.setName("Dheeru");
		pet.setAnimal(getDog());
		return pet;
	}
	@Bean("author")
	public Author getAuthor() {
		return new Author("Katheyl");
	}
	@Bean("book")
	public Book getBook() {
		Book book=new Book();
		book.setName("OCA Certification guide");
		book.setAuthor(getAuthor());
		return book;
	}
	
	}
	
