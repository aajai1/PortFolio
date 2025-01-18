package com.PortTest.test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.PortTest.utils.DriverKit;
import com.PortTest.utils.Source;

public class DresumeDownload {
	@Test
	public static void resumeDownload() {
		
		
		WebDriver driver = DriverKit.driverKit();
		driver.manage().window().maximize();
		String urlResume = Source.sourceUrl();
		driver.get(urlResume);
		driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[1]/div/button")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String path = "C:\\Users\\Shyam\\Downloads\\premkumar.pdf";
		
		File file = new File(path);
		
		if(file.exists()) {
			System.out.println("Resume Downloaded Succesfully. ");
		}else {
			System.out.println("Resume Already Exists.");
		}
		
		driver.quit();
	}
	

}
