package com.abc.JS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	By email = By.id("email");
	By pwd = By.id("pass");
	By login = By.id("send2");

	public void typeEmail() {
		driver.findElement(email).sendKeys("kundansinghmahisour@gmail.com");		
	}
	public void typePwd() {
		driver.findElement(pwd).sendKeys("Welcome@123");		
	}
	public void typeLogin() {
		driver.findElement(login).click();;		
	}


}
