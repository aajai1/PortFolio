package com.PortTest.test;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.PortTest.utils.DriverKit;
import com.PortTest.utils.Source;

public class socialConnections {
	
	@Test
	
	public static void socialConnections() {
		WebDriver driver = DriverKit.driverKit();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String urls = Source.sourceUrl();
		driver.get(urls);
		
		//LinkedIN
				driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[2]/div/div[1]")).click();
				
				String linkedInsite = driver.getCurrentUrl();
				
					System.out.println("Current Link : "+linkedInsite);
			
				
		//Whatsapp
				driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[2]/div/div[2]")).click();
				
				String whatsappsite = driver.getCurrentUrl();
				
					System.out.println("Current Link : "+whatsappsite);
				
		//GitHUb
				driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[2]/div/div[4]")).click();
				
				String gitSite = driver.getCurrentUrl();
				
					System.out.println("Current Link : "+gitSite);
				
		//Mail
				driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[2]/div/div[3]")).click();
				
				String mailSite = driver.getCurrentUrl();
				
					System.out.println("Current Link : "+mailSite);
				
				driver.quit();
				
		
		
		
	}

}
