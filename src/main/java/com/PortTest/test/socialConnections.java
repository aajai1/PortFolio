package com.PortTest.test;



import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.PortTest.utils.DriverKit;
import com.PortTest.utils.DriverWaitEx;
import com.PortTest.utils.Source;
import com.PortTest.utils.SwitchToWindow;


public class socialConnections {

	@Test

	public static void socialConnections() {
		WebDriver driver = DriverKit.driverKit();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String urls = Source.sourceUrl();
	
		driver.get(urls);
		
		String parentWindowHandle = driver.getWindowHandle();

		//LinkedIN

		
		driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[2]/div/div[1]")).click();
		SwitchToWindow.switchToWindow(driver);
		String linkedInsite = driver.getCurrentUrl();
		System.out.println("Current Link : "+linkedInsite);
		
		driver.close();
		driver.switchTo().window(parentWindowHandle);
		


		//Whatsapp

		driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[2]/div/div[2]")).click();
		
		SwitchToWindow.switchToWindow(driver);
		String whatsappsite = driver.getCurrentUrl();
		System.out.println("Current Link : "+whatsappsite);
		driver.close();
		driver.switchTo().window(parentWindowHandle);

		//GitHUb


		driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[2]/div/div[4]")).click();
		

		SwitchToWindow.switchToWindow(driver);
		String gitSite = driver.getCurrentUrl();
		System.out.println("Current Link : "+gitSite);
		driver.close();
		driver.switchTo().window(parentWindowHandle);
		

//		//Mail
//
//		
//		driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[2]/div/div[3]")).click();
//		
//		SwitchToWindow.switchToWindow(driver);
//		String mailLink = driver.getCurrentUrl();
//		System.out.println("Current Link : "+mailLink);

		driver.quit();




	}

}