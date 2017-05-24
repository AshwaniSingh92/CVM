package com.Tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import FactoryMethods.DriverFactory;
import FactoryMethods.ListenerClass;



@Listeners(ListenerClass.class)
public class TestBaseTwo extends DriverFactory {
	
	
	@Test 
	public void Onboarding(){
		
	//driver.navigate().to("www.gmail.com");
		
		System.out.println("First Method from the TestBaseTwo");
		
	}
	
	
	@Test
	public void Deregister(){
		
		System.out.println("Second Method from TestBaseTwo");
	}
	

	
	

}
