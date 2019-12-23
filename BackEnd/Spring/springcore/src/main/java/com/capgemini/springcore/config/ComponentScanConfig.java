package com.capgemini.springcore.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.capgemini.springcore.beans")//another way of creating  bean
public class ComponentScanConfig {}

	


