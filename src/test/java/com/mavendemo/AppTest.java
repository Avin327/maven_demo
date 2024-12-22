package com.mavendemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest 
{
	WebDriver driver;
	
	@AfterClass
    public void setup() {
    	driver = new ChromeDriver();
    	driver.get("url");
    }
	
	@Test
	public void testInput() {
		WebElement ele = driver.findElement(By.id(""));
		ele.sendKeys("");
		WebElement button = driver.findElement(By.xpath(""));
		button.click();
	}
    @BeforeClass
    public void end() {
    	driver.close();
    }
}
