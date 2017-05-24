package com.Tests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Pages.LoginPage;

import FactoryMethods.DriverFactory;
import FactoryMethods.ListenerClass;
import FactoryMethods.PropertyReader;

@Listeners(ListenerClass.class)
public class TestBaseOne extends DriverFactory{

	
	LoginPage lp;
	
	
	@BeforeClass
	public void setup(){		
		//driver= getDriver(prop.readProperty("browser"));
		
		lp = new LoginPage(driver);		
		
		
	}
	
	
	
	
	@Test(priority = 1)
	public void Registration(){
		
		System.out.println("First Element from LoginPage"+lp.getFirstElement());
		
		
		//driver.navigate().to(prop.readProperty("url"));
	
		
	}
	
	
	
	@Test(priority = 2)
	public void ProductBook(){
		
		System.out.println("Second element from the login page");
		
		//driver.navigate().to("https://www.google.co.in/");
		
	}
	
	
	
}
