package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class LoginPageTestngClass {
	public static WebDriver d;
	ChromeOptions co = new ChromeOptions();

	@Test
	public void f() {
		d.findElement(By.xpath("//input[@id='input-username']")).sendKeys("Abhisha");
		d.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Manisha");
		d.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Jagtap");
		d.findElement(By.xpath("//input[@id='input-email']")).sendKeys("manishajagatap1@gmail.com");
		Select country = new Select(d.findElement(By.xpath("//select[@id='input-country']")));
		country.selectByVisibleText("India");
		d.findElement(By.xpath("//input[@id='input-password']")).sendKeys("mani@123");

	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","D:\\Manisha SoftwareTesting\\SeleniumData\\chromedriver-win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.opencart.com/index.php?route=account/register");
		
	}

	@AfterTest
	public void afterTest() {
		d.manage().window().maximize();
		System.out.println(d.getCurrentUrl());

		WebElement web = d.findElement(By.xpath("//input[@id='input-username']"));
		String s = web.getAttribute("value");
		System.out.println("The username is =" + s);
		
		
		WebElement web2 = d.findElement(By.xpath("//input[@id='input-username']"));
		String s2 = web2.getAttribute("value");
		System.out.println("The password is =" + s2);
			
		
	}

}


