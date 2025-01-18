package com.PortTest.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.asserts.*;
import org.testng.annotations.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PortTest.utils.DriverKit;
import com.PortTest.utils.Source;
import com.PortTest.utils.SwitchToWindow;

import dev.failsafe.internal.util.Assert;
import net.bytebuddy.jar.asm.Handle;

public class PortFunctions {
	@Test
	public static  void PortFunctions() {
		WebDriver driver = DriverKit.driverKit();
		String urls =Source.sourceUrl();
		driver.get(urls);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[1]/a/div")).click();
		WebElement contactCheck= driver.findElement(By.xpath("//*[@id=\"contact\"]/div/div[1]/h2"));
		String cct= contactCheck.getText();
		System.out.println("Idenified text for Contact : "+ cct);
		AssertJUnit.assertEquals(cct, "GET IN TOUCH");
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/a[2]/div")).click(); //aboutme
		WebElement aboutme = driver.findElement(By.xpath("//*[@id=\"about\"]/div/div/div[1]/h2"));
		String am = aboutme.getText();
		System.out.println("Identified text for About Us : " +am);
		AssertJUnit.assertEquals(am,"FULL STACK DEVELOPER");
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/a[3]/div")).click(); //project
		WebElement projectTab = driver.findElement(By.xpath("//*[@id=\"project\"]/div/p"));
		String pt = projectTab.getText();
		System.out.println("Identified text for Project : " +pt);
		AssertJUnit.assertEquals(pt,"A collection of innovative and impactful projects showcasing my skills and problem-solving approach.\" Let me know if you'd like a more tailored description!");
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/a[4]/div")).click(); //contact
		WebElement contactCheck1= driver.findElement(By.xpath("//*[@id=\"contact\"]/div/div[1]/h2"));
		String cct1= contactCheck.getText();
		boolean iscct1 = cct1.equals("GET IN TOUCH");
		
		if(iscct1) {
			System.out.println("Idenified text for Contact : "+ cct);
			
		}else {
			System.out.println(" No text found for contact ");
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/a[3]/div")).click(); 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Ecommerce
		driver.findElement(By.xpath("//*[@id=\"project\"]/div/div[1]/div/button")).click();
		SwitchToWindow.switchToWindow(driver);		
		String currentUrl= driver.getCurrentUrl();
		System.out.println("Current Url : " +currentUrl);
		driver.close();
		driver.switchTo().window(parent);
		
		//corporate
		
		driver.findElement(By.xpath("//*[@id=\"project\"]/div/div[2]/div/button")).click();
		SwitchToWindow.switchToWindow(driver);
		String corporateSite = driver.getCurrentUrl();
		System.out.println("Current Url : " +corporateSite);
		driver.close();
		driver.switchTo().window(parent);
		
		//Real Estate
		driver.findElement(By.xpath("//*[@id=\"project\"]/div/div[3]/div/button")).click();
		SwitchToWindow.switchToWindow(driver);
		String realSite = driver.getCurrentUrl();
		System.out.println("Current Url : " +realSite);
		driver.close();
		//driver.switchTo().window(parent);
		
		
		//driver.quit();
	
		
		
	}

}
