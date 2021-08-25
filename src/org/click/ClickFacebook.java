package org.click;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickFacebook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunk\\eclipse-workspace\\ClickOption\\Driver\\chromedriver.exe");
		
		WebDriver lash = new ChromeDriver();
		
		lash.get("https://www.facebook.com/");
		
		//inspect web elements for email box.
		WebElement a= lash.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		
		
	//insert value
		a.sendKeys("arunkumar904.ak@gmail.com");
		
		//inspectweb elements for password.
		
		WebElement b =lash.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		
		//insertvalue
		
		b.sendKeys("Qw452887222");
		
		
		//Webelement click
		
		WebElement Lakshmi = lash.findElement(By.name("login"));
		
		//Click button.
		
		
		Lakshmi.click();
		
		
		
		
		
		
		
		
	}

}
