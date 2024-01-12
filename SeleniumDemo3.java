package com.selenium;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumDemo3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumData\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
	
		co.setBrowserVersion("120");
		WebDriver d=new ChromeDriver(co);
		d.get("https://www.google.com");
		d.manage().window().maximize();
		d.get("https://chromedriver.chromium.org");

	}

}