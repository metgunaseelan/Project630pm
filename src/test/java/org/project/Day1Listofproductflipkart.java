package org.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Listofproductflipkart {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\Project630PM\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement btnClose = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		btnClose.click();
		WebElement txtSearch = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		txtSearch.sendKeys("I Phone");
		WebElement btnSearch = driver.findElement(By.xpath("//button[@class='vh79eN']"));
		btnSearch.click();
		Thread.sleep(3000);
		List<WebElement> allProducts = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		
		int size = allProducts.size();
		
		System.out.println(size);
		
		for (int i = 0; i < allProducts.size(); i++) {
			
			WebElement eachElement = allProducts.get(i);
			String mobileList = eachElement.getText();
			System.out.println(mobileList);
		}
	
		driver.quit();
		
		
		
	}

}
