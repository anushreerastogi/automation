package com.qspider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"/home/archit/Documents/all-selenium/geckodriver-v0.24.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(
				"https://www.flipkart.com/?gclid=CjwKCAjw1rnqBRAAEiwAr29II8xposcA6YqSzCX-P1j_jitjvf1wuXSgDm1YzYdx6UM4BS7JP56IdhoCwEIQAvD_BwE&ef_id=CjwKCAjw1rnqBRAAEiwAr29II8xposcA6YqSzCX-P1j_jitjvf1wuXSgDm1YzYdx6UM4BS7JP56IdhoCwEIQAvD_BwE:G:s&s_kwcid=AL!739!3!376512959741!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog");
		driver.findElement(By.xpath("//button[text()='✕']")).click();

		WebElement wb = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		wb.sendKeys("iphone 7");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// verify ram

		driver.findElement(By.xpath("//label[contains(.,'Less than 512 MB')]")).click();

	}

}
