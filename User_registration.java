package org.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class User_registration {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//launch browser window and load application
		WebDriver driver=new FirefoxDriver();
		driver.get("http://hotmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("signup")).click();
		
		driver.findElement(By.id("FirstName")).clear();
		driver.findElement(By.id("FirstName")).sendKeys("newuser");
		
		driver.findElement(By.id("LastName")).clear();
		driver.findElement(By.id("LastName")).sendKeys("webdriver");
		
		driver.findElement(By.id("MemberName")).clear();
		driver.findElement(By.id("MemberName")).sendKeys("newuserwebdriver123456");
		

		
		
		
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("hello12345");

	}

}
