package com.PortTest.test;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.PortTest.utils.DriverKit;
import com.PortTest.utils.Source;

public class LInkedIn {
	
	@Test
	
	public static void linkedIn() {
		WebDriver driver = DriverKit.driverKit();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String urls = Source.sourceUrl();
		driver.get(urls);
		
		//LinkedIN
				driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[2]/div/div[1]")).click();
				
				String linkedInsite = driver.getCurrentUrl();
				boolean isLinkedIn = linkedInsite.equals("https://www.linkedin.com/in/premkumar-ananthan/");
				
				if(isLinkedIn) {
					System.out.println("Current Link : "+isLinkedIn);
				}
				else {
					System.out.println("NO Link Found");
				}
		//Whatsapp
				driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[2]/div/div[2]")).click();
				
				String whatsappsite = driver.getCurrentUrl();
				boolean isWhatsapp = linkedInsite.equals("https://www.linkedin.com/in/premkumar-ananthan/");
				
				if(isWhatsapp) {
					System.out.println("Current Link : "+isWhatsapp);
				}
				else {
					System.out.println("NO Link Found");
				}
		//GitHUb
				driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[2]/div/div[4]")).click();
				
				String gitSite = driver.getCurrentUrl();
				boolean isGit = linkedInsite.equals("https://www.linkedin.com/in/premkumar-ananthan/");
				
				if(isGit) {
					System.out.println("Current Link : "+isGit);
				}
				else {
					System.out.println("NO Link Found");
				}
		//Mail
				driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[2]/div/div[3]")).click();
				
				String mailSite = driver.getCurrentUrl();
				boolean isMail = linkedInsite.equals("https://www.linkedin.com/in/premkumar-ananthan/");
				
				if(isMail) {
					System.out.println("Current Link : "+isMail);
				}
				else {
					System.out.println("NO Link Found");
				}
				
		
		
		
	}

}
