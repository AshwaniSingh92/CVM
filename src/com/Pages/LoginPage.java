package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	
	
	public LoginPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);	
		
		
	}
	
	
	public String getFirstElement() {
		return firstElement;
	}


	public void setFirstElement(String firstElement) {
		this.firstElement = firstElement;
	}


	private String firstElement = "Ashu";
	
	

}
