package com.capgemini.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello {//implements InitializingBean,DisposableBean{
	public Hello() {
		System.out.println("object created");
	}
	public Hello(String messsage) {
		this.messsage=messsage;
		
	}
	private String messsage;
	
	@PostConstruct//after construction of object execute this method
	public void init() {
		System.out.println("init method");
	}
	@PreDestroy//before destroying object execute this method
	public void destroy() {
		System.out.println("destroy method");
	}

	public String getMesssage() {
		return messsage;
	}

	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("after properties set");
//		
//	}
	
	

}
