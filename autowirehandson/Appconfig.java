package com.springdemo.autowirehandson;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
	
	@Bean(name="passport")
	public Passport getPassport()
	{

		return new Passport();
		
	}
	
	@Bean
	public Employee getEmployee()
	{
		return new Employee();
		
	}

}
